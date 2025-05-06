public class App {
    public static void main(String[] args) throws Exception {
        
        Defender fBaresi = new Defender("Franco Baresi", 3, "Difensore Centrale");
        Mildfielder zZidane = new Mildfielder("Zinedine Zidane", 6, "Trequartista");

        fBaresi.speakNameNumber();
        fBaresi.speakRole();
    
        zZidane.speakNameNumber();
        zZidane.speakRole();

        zZidane.setName("Zizou");
        zZidane.speakNameNumber();
    }
}
