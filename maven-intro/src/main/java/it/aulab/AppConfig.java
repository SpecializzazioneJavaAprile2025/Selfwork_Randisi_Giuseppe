package it.aulab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.aulab.models.Jeeg;
import it.aulab.models.Leg;
import it.aulab.models.Arm;


@Configuration
@ComponentScan("it.aulab")
public class AppConfig {

    @Bean(name = "jeeg")
    public Jeeg getJeeg(){
        return new Jeeg(getArmSx(), getArmDx(), getLeg());
    }
    
    @Bean(name = "armSx")
    @Scope("prototype")
    public Arm getArmSx(){
        return new Arm(Side.SX); 
    }
    
    @Bean(name = "armDx")
    public Arm getArmDx(){
        return new Arm(Side.DX);
    }
    
    @Bean(name = "leg")
    public Leg getLeg(){
        return new Leg();
    }

}   
