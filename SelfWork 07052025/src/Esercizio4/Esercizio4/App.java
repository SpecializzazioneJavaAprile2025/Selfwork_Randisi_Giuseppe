package Esercizio4;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /*4- chiedete all’utente quale persona vuole modificare, chiedete i dati e aggiornate quell’elemento della lista*/

        List<Person> persons = new ArrayList<Person>();
        
        persons.add(new Person("Giuseppe", "Randisi"));
        persons.add(new Person("Antonio", "Randisi"));
        persons.add(new Person("Rachele", "Balletti"));
     
        Person.print(persons);
        Person.updateRecord(persons);

        }
    }   

