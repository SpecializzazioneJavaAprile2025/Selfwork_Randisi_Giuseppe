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
    
    public static void filterAndPrintCharacter (List<Character> charaters, CharacterPredicateInterface predicate) {
        charaters.stream()
            .filter(predicate::filter)
            .map(Character::getName)
            .forEach(System.out::println);  
    }
}
