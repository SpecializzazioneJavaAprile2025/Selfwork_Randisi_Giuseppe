public class Person {
    private String name;
    private int age;
}

//Data una lista di oggetti Person(name, age), stampare solo i maggiorenni, ordinati alfabeticamente per nome.

// Tecnologie da usare:
// .stream()

// .filter(p -> p.getAge() >= 18)

// .sorted(Comparator.comparing(Person::getName))

// .forEach(...) per la stampa