public class Player {
   
    private String name;
    private String surname;
    private int age;
    private int number;
    private String strongFoot;
    
    public Player(String name, String surname, int age, int number, String strongFoot) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;
        this.strongFoot = strongFoot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStrongFoot() {
        return strongFoot;
    }

    public void setStrongFoot(String strongFoot) {
        this.strongFoot = strongFoot;
    }

    public void introducingPlayer(){
        System.out.println("  ");
        System.out.println("Salve, sono " + name + " " + surname + " ed ho " + age + " Anni");
        System.out.println("  ");
    }

    public void speakNumber() {
        System.out.println("Gioco con il numero" + number);
    }

    public void speakStrongFoot() {
        System.out.println("Il mio Piede forte è il " + strongFoot);
    
    }


}
