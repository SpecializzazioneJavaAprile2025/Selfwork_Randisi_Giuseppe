public class Defender extends Player {
     
    public String role;

    public Defender(String name,int number, String role) {
        super(name, number);
        this.role = role;
    }
    
    public void speakRole(){
        System.out.println(" come "+ role);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (obj instanceof Defender) {
        Defender d = (Defender) obj;
        return this.role.equals(d.role);
        }
        return false;
        }
}
