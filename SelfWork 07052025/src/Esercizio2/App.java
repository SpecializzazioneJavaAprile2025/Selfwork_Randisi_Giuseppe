package Esercizio2;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        
        Set <Game> games = new HashSet<>();

        games.add(new Game("Super Mario World", "Nintendo",1992));
        games.add(new Game("Mario 64", "Nintendo",1996));
        games.add(new Game("Mario Kart 64", "Nintendo",1993));
    
    for (Game g : games){
        System.out.println("Nome= " + g.getName() + ", Prodotto da " + g.getProducer() + " nell'anno " + g.getYear());

        }
    }
}
