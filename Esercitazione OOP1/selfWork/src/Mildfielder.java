public class Mildfielder extends Player {
     
        public String role;
    
        public Mildfielder(String name,int number, String role) {
            super(name, number);
            this.role = role;
        }
        
        public void speakRole(){
            System.out.println(" come  "+ role);
        }

        @Override
        public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (obj instanceof Mildfielder) {
        Mildfielder m = (Mildfielder) obj;
        return this.role.equals(m.role);
        }
        return false;
        }

}
