package it.aulab.progetto_spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//Annotazione per configurazione. IL framwork si aspetta le istruzioni

@EnableWebSecurity
public class SecurityConfig {

    private final static String cspDirectives ="default-src 'self' ; img-src 'self'; script-src 'self' cdn.jsdelivr.net 'unsafe-inline'; style-src 'self' cdn.jsdelivr.net cdnjs.cloudflare.com ; font-src cdnjs.cloudflare.com;";

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
        //Stesso Encoding di LARAVEL
    }
    @Bean
    public InMemoryUserDetailsManager userManager(){
        //Classe padrona del controllo totale degli utenti
        
        UserBuilder user = User.withUsername("user").password(encoder(). encode("123456789"));
        //Faccaimo l'encode della password. Quindi non sarà più 123456789 l'encoding di 123456789.

        UserBuilder admin = User.withUsername("admin").password("admin123");
        //Importiamo gli utenti forzatamente. Saranno presenti nella ram; Ergo = Niente DB

        return new InMemoryUserDetailsManager(user.build(), admin.build());
    }

    @Bean
    public SecurityFilterChain configSecurityFilterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests((authorize) -> authorize
                        .requestMatchers("/api/**").permitAll().anyRequest().authenticated())
                        // .formLogin(Customizer.withDefaults()); ripristiniamo il richiamo a login se accediamo al sito
                        //Questo però ci darà la pagina di login "Default" di spring (Non proprio il massimo)

                        //.formLogin((formLogin)-> formLogin.loginPage("/login").permitAll()); 
                        //Richiamiamo un formlogin presonalizzato indicandogli che la pagina sarà chiamata login.html
                        //permitAll() = Indica che è accessibile a tutti (ovviamente andrà solo chi non autenticato)
                            //Questo va Bene solo e solo SE la uri e la url hanno lo stesso nome; Caso contrario
                        .formLogin((formLogin)->formLogin.loginPage("/login")
                                                          .loginProcessingUrl("/login")//In questo caso specifichiamo il nome del file. Non vale qui ma vale quando URI E URL NON COMBACIANO.
                                                          //.loginProcessingUrl = Indichi quale nome ha la pagina di login
                                                          .defaultSuccessUrl("/", true)
                                                          //Indichiamo l'url di DEFAULT per fare il redirect in caso di login Avvenuto con successo
                                                          //2 Parametri Accettati = 
                                                            //1) Url di arrivo dopo login
                                                            //2) attiva o disattiva un comportamento.
                                                                //Se true = vai dove ti indico Io
                                                                //Se false = torna da dove stavi vendendo 
                                                          .permitAll())
                        .logout((logout)-> logout.logoutUrl("/logout")
                                               .logoutSuccessUrl("/"))
                        .csrf( //Impostiamo un'altro Filter Chain per le richieste api
                                (csrf) -> csrf.ignoringRequestMatchers("/api/**"))
                                // .ignoringRequestMatchers = Se ti arriva una richiesta come ti indico io
                                    //Ingora la necessità del csrf
                                        //ERGO = NON DEVI FARLO. Il csrf SERVE SEMPRE.
                                            //Una chiamata API non deve fare mezzo mondo
                        .headers( //Ennesimo FilterChain
                            (headers)-> headers.xssProtection(Customizer.withDefaults())
                                                //.contentSecurityPolicy((Customizer.withDefaults()))); 
                                                // .withDefaults = a default Blocchi tutto
                                                .contentSecurityPolicy((csp) -> csp.policyDirectives(cspDirectives)));
        //Filter Chain
         //In questo caso, senza credenziali, ci permette solo richieste api
        return http.build();
        //Riprendi da 1.57.00
    }
}
