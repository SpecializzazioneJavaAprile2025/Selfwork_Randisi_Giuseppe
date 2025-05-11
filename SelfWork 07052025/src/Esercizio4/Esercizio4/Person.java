package Esercizio4;

import java.util.List;
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

    public static void print(List<Person> persons) {
    for (int i=0; i<persons.size(); i++){
    Person p = persons.get(i);
    System.out.println("== DETTAGLI PERSONA ==");
    System.out.println("Id: " + i);
    System.out.println("Nome: " + p.name);
    System.out.println("Cognome: " + p.surname);
    System.out.println("======================");
        }
    }
    
    public static void updateRecord(List<Person> persons){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicami l'id della Persona da Modificare");
        int searchKey = scanner.nextInt();
        scanner.nextLine();
        if(searchKey >=0 && searchKey< persons.size()){
            Person p = persons.get(searchKey);
            System.out.println("Vecchio Nome: " + p.name);
            System.out.println("--- ---");
            System.out.println("Indicami il Nuovo Nome: ");
            String newName = scanner.nextLine();
            System.out.println("--- ---");
            System.out.println("Vecchio Cognome: " + p.surname);
            System.out.println("--- ---");
            System.out.println("Indicami il Nuovo Cognome: ");
            String newSurname = scanner.nextLine();
            p.setName(newName);
            p.setsurname(newSurname);
            System.out.println("========");
            System.out.println("========");
            System.out.println("Record Aggiornato Con Successo: ");
        } else {
            System.out.println("Id Non Valido");
        }

        System.out.println("====Lista Aggiornata====");
        Person.print(persons);    
    }
}