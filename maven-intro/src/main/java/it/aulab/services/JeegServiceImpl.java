package it.aulab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import it.aulab.Side;
import it.aulab.models.Arm;
import it.aulab.models.Jeeg;
import it.aulab.models.Leg;
import it.aulab.repositories.JeegRepository;

@Component("jeegService")
public class JeegServiceImpl implements JeegService {

    @Autowired
    private JeegRepository jeegRepository;

    public JeegRepository getRepository(){
        return jeegRepository;
    }

    public void setRepository(JeegRepository repository){
        
        this.jeegRepository = repository;
    }

    @Override
    public void attack() {
        if(this.jeegRepository.getJeeg() != null){
            Jeeg jeeg =this.jeegRepository.getJeeg();
            Arm armDx = jeeg.getArmDx();
            Arm armSx = jeeg.getArmSx();
            armSx.attack(Side.SX);
            armSx.attack(Side.DX);
        }
    }

    @Override
    public void move() {
        if(this.jeegRepository.getJeeg() != null){
            Jeeg jeeg =this.jeegRepository.getJeeg();
            Leg leg = jeeg.getLeg();
            leg.walkBackward();
            leg.walkForward();
                   
        }
    }
}