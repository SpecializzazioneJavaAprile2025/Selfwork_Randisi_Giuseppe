package Esercizio5;

import java.util.Map;
import java.util.Scanner;

public class Person {

    private String name;
    private String surname;
    
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setsurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString(){
        return "Nome: " + name + ", Cognome: "+ surname;
    }

    public static void createMap(Map<String, Person> personMap){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Metodo Di CREAZIONE MAP");
        System.out.println("//----\\");
        System.out.println("Dichiara Quanti Oggetti Creare nella Map:");
        Integer howManyObject = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i< howManyObject; i++  ){
            System.out.println("Indicami La chiave di Ricerca:");
            String key = scanner.nextLine();
            System.out.println("Indicami il Nome del nuovo Record:");
            String n = scanner.nextLine();
            System.out.println("Indicami il Cognome del nuovo Record:");
            String sur = scanner.nextLine();
            personMap.put( key, new Person(n, sur));
        }
    }

    public static void addRecord(Map<String, Person> personMap){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metodo per Aggiungi un Nuovo Record");
        System.out.println("Indicami la Chiave di ricerca");
        String key = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Digita Il nome del Nuovo Record");
            String pName = scanner.nextLine();
        System.out.println("Digita Il Cognome del Nuovo Record");
            String pSurname = scanner.nextLine();
        System.out.println("Indicami il Nuovo Nome: ");
        personMap.put(key, new Person(pName, pSurname));    
            System.out.println("========");
            System.out.println("========");
            System.out.println("Record Aggiornato Con Successo: ");
            System.out.println(personMap);
        }

    public static void print(Map<String, Person> personMap) {
    for (Map.Entry<String, Person> entry : personMap.entrySet()){
        System.out.println("== DETTAGLI PERSONA ==");
        System.out.println("Chiave: " + entry.getKey());
        System.out.println("Nome: " + entry.getValue().getName());
        System.out.println("Cognome: " + entry.getValue().getSurname());
        System.out.println("=======================");
    }
    }
    
    public static void removeRecord(Map<String, Person> personMap){
        Scanner scanner = new Scanner(System.in);
        Person.print(personMap);
        System.out.println("Indicami la Chiave del Record Da Eliminare");
        String key = scanner.nextLine();
        if(personMap.containsKey(key)){
            personMap.remove(key);
            System.out.println("Record con Chiave "+ key + " Eliminato");
        } else {
            System.out.println("Chiave di Ricerca non Trovata.");
        }
    }

    public static void searchRecord(Map<String, Person> personMap){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicami Una Chiave di Ricerca(oppure scrivi 'Stop' per uscire):\"");
        String searchKey = scanner.nextLine();
            if(personMap.containsKey(searchKey)){
                System.out.println("Chiave di Ricerca Trovata");
                System.out.println("");
                Person p = personMap.get(searchKey);
                    
                System.out.println("Nome: "+ p.getName());
                System.out.println("Cognome: "+ p.getSurname());
            } else if (searchKey.equalsIgnoreCase("Stop")) {
                System.out.println("Programma Chiuso");
            } else {
                System.out.println("Chiave Non Associata ad Alcun Record; Riprova");
                Person.searchRecord(personMap);
             }
    }
}