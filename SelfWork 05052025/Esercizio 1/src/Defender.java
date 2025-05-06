public class Defender extends Player implements Details {
    private String role;
    private int redCard;

    public Defender(String name, String surname, int age, int number, String strongFoot, String role, int redCard) {
        super(name, surname, age, number, strongFoot);
        this.role = role;
        this.redCard = redCard;
    }

    @Override
    public void speakRole() {
        System.out.println("Gioco Come Difensore nel ruoto di " + role);
    }

    @Override
    public void speakStats() {
        System.out.println("Al momento ho totalizzato " + redCard + " Cartellini Rossi in Campionato");
    }

    

}
