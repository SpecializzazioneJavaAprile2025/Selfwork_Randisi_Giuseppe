public class App {
    public static void main(String[] args) throws Exception {
     
    Defender Chiellini = new Defender("Giorgio","Chiellini", 38, 3, "Destro", "Stopper", 8);

    Mildfielder Pirlo = new Mildfielder("Andrea","Pirlo", 37, 21, "Destro", "Regista", 12);
    
    Pirlo.introducingPlayer();
    Pirlo.speakRole();
    Pirlo.speakStats();

    Chiellini.introducingPlayer();
    Chiellini.speakRole();
    Chiellini.speakStats();

    }
}
