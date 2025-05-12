package Esercizio5;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
       /*5- Scrivere un programma che dichiari una mappa con chiave di tipo string e oggetto a vostra discrezione che prenda in input dei valori, crei un oggetto e aggiunga l’oggetto alla mappa. Dopo provare a rimuovere l’oggetto e cercare nuovamente l’oggetto nella mappa*/

        Map<String, Person> personMap  = new HashMap<>();
        personMap.put("Primo", new Person("Franco", "Pippo"));
        personMap.put("Secondo", new Person("Leo", "Gullotta"));
        personMap.put("Terzo", new Person("Luca", "Laurenti"));

        Person.print(personMap);
        }
    }   

