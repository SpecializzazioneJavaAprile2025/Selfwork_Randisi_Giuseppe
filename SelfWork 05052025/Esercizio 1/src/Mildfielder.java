public class Mildfielder extends Player implements Details {

    private String role;
    private int assist;

    public Mildfielder(String name, String surname, int age, int number, String strongFoot, String role, int assist) {
        super(name, surname, age, number, strongFoot);
        this.role = role;
        this.assist = assist;
    }

    @Override
    public void speakRole() {
        System.out.println("Gioco Come Centrocampista nel ruoto di " + role);
    }

    @Override
    public void speakStats() {
        System.out.println("Al momento ho totalizzato " + assist+ " Assist in Campionato");
    }

}
