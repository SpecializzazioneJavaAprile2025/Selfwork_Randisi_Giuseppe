package it.aulab.models;

public class Jeeg {
    
    private Arm armSx;
    private Arm armDx;
    private Leg leg;
    
    public Jeeg(Arm armSx,Arm armDx, Leg leg) {
        
        this.armSx = armSx;
        this.armDx = armDx;
        this.leg = leg;
    
    }
    
    public Arm getArmSx() {
        return armSx;
    }
    
    public void setArmSx(Arm armSx) {
        this.armSx = armSx;
    }
    
    public Arm getArmDx() {
        return armDx;
    }
    
    public void setArmDx(Arm armDx) {
        this.armDx = armDx;
    }
    
    public Leg getLeg() {
        return leg;
    }
    
    public void setLeg(Leg leg) {
        this.leg = leg;
    }
    
}
