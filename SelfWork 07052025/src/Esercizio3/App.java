package Esercizio3;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        /*3- Creare una mappa con degli oggetti, chiedere all’utente di inserire una chiave e provare a cercare l’oggetto corrispondente nella mappa*/
     
        Map<RubricaKey,Person> personMap = new HashMap<>();
        
        Person giuseppe = new Person("Giuseppe", "Randisi", "AABBCC");    
        RubricaKey r1 = new RubricaKey(giuseppe.getCf());
        personMap.put(r1, giuseppe);
    
        Person antonio = new Person("Antonio", "Randisi", "DDEEFF");    
        RubricaKey r2 = new RubricaKey(antonio.getCf());
        personMap.put(r2, antonio);
    
        Person franco = new Person("Franco", "Pippo", "GGHHII");    
        RubricaKey r3 = new RubricaKey(franco.getCf());
        personMap.put(r3, franco);
    
        String searchCf = Person.searchPerson();
        RubricaKey searchKey = new RubricaKey(searchCf);
        Person findIt = personMap.get(searchKey);
        
        if(findIt != null){
        System.out.println("Persona trovata: " + findIt.getName() + " " + findIt.getSurname());
            } else {
        System.out.println("Nessuna persona trovata con quel codice fiscale.");
        }
        }
    }   

