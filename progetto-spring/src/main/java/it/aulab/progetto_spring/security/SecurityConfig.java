package it.aulab.progetto_spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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

        http.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/**").permitAll().anyRequest().authenticated());
        //Filter Chain
         //In questo caso, senza credenziali, ci permette solo richieste api
        return http.build();
        //Riprendi da 1.04.42
    }
}
