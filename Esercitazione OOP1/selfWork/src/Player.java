public class Player {

    private String name;
    private int number;

    protected Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    } 

    public void speakNameNumber(){
        System.out.print("Ciao sono " + name + " ,Gioco con il Numero " + number );
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        //Verifico se il parametro obj è null o le descrizioni dei due parametri sono diverse
        if(obj == null || this.getClass() != obj.getClass()) return false;

        Player p2 = (Player) obj;
        if(this.name == p2.name && this.number == p2.number){
            return true;
        }
             return false;
    }
    
}
