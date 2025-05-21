import java.util.List;

public class Character {

    private String name;
    private Type type;
    private Race race;
    
    public Character(String name, Type type, Race race) {
        this.name = name;
        this.type = type;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
    
    public static void filterAndPrintCharacter (List<Character> characters, CharacterPredicateInterface predicate, Type type) {

        System.out.println("Stampa di Ogni: " + type + " e rispettiva Razza");
        System.out.println("--------");
        long count = characters.stream()
        //Suggerimento di ChatGpt: Incapsulare su variabile count di tipo long l'estratto dello stream
            .filter(predicate::filter)
            .peek(c -> System.out.println(c.getName() + " - " + c.getType() + " - " + c.getRace()))
            .count();
            //Serve per chiudere .peek()
            System.out.println("Totale trovati: " + count); 
        //Per poi stamparlo    
    } 
}
