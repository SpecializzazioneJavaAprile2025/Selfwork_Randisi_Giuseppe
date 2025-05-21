import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
    
    List<Character> characters = List.of(

            new Character("Geralt", Type.WITCHER, Race.HUMAN),
            new Character("Jennefer", Type.ASSASSIN, Race.HUMAN),
            new Character("IronMan", Type.CYBORG, Race.HUMAN),
            new Character("Link", Type.KNIGHT, Race.ELF),
            new Character("Gandalg", Type.MAGE, Race.HUMAN),
            new Character("Legolas", Type.ARCHER, Race.ELF),
            new Character("Kharjo", Type.ASSASSIN, Race.KHAJIIT),
            new Character("Aragon", Type.KNIGHT, Race.HUMAN),
            new Character("Vesemir", Type.WITCHER, Race.HUMAN),
            new Character("Ciri", Type.WITCHER, Race.HUMAN),
            new Character("Ezio Auditore", Type.ASSASSIN, Race.HUMAN),
            new Character("Arya Stark", Type.ASSASSIN, Race.HUMAN),
            new Character("Robocop", Type.CYBORG, Race.HUMAN),
            new Character("Cyborg", Type.CYBORG, Race.HUMAN),
            new Character("Jaime Lannister", Type.KNIGHT, Race.HUMAN),
            new Character("Merlin", Type.MAGE, Race.HUMAN),
            new Character("Doctor Strange", Type.MAGE, Race.HUMAN),
            new Character("Katniss Everdeen", Type.ARCHER, Race.HUMAN),
            new Character("Green Arrow", Type.ARCHER, Race.HUMAN),
            new Character("Zeus", Type.DIVINITY, Race.HIGHELF),
            new Character("Ra", Type.DIVINITY, Race.HUMAN),
            new Character("Odin", Type.DIVINITY, Race.HUMAN),
            new Character("Thranduil", Type.KNIGHT, Race.ELF),
            new Character("Galadriel", Type.MAGE, Race.HIGHELF),
            new Character("Elrond", Type.MAGE, Race.HIGHELF),
            new Character("Gimli", Type.KNIGHT, Race.DWARF),
            new Character("Thorin", Type.KNIGHT, Race.DWARF),
            new Character("Dwalin", Type.KNIGHT, Race.DWARF),
            new Character("Ra'zirr", Type.ASSASSIN, Race.KHAJIIT),
            new Character("M'aiq the Liar", Type.MAGE, Race.KHAJIIT)

            );
            
            //ordiniamo e stampiamo le varie Liste usando alcuni filtri per tipologia
            //Non li uso tutti senno famo notte
            
        //Character.filterAndPrintCharacter(characters, c -> c.getType() == Type.MAGE, Type.MAGE);
        //Character.filterAndPrintCharacter(characters, c -> c.getType() == Type.ARCHER, Type.ARCHER);
        //Character.filterAndPrintCharacter(characters, c -> c.getType() == Type.KNIGHT, Type.KNIGHT);
        //Si lo so, non è elegante passare due volte la stessa cosa (il Type); ma idealmente nel form di ricerca seleziono il form una volta, incapsulo nella variabile e la passo due volte per mantere la interface generica
        
        }
}
