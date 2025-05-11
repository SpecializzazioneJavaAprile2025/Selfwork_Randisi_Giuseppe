package Esercizio3;
import java.util.Scanner;

public class Person {

    private String name;
    private String surname;
    private String cf;

    public Person(String name, String surname, String cf) {
        this.name = name;
        this.surname = surname;
        this.cf = cf;
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
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getCf() {
        return cf;
    }
    public void setCf(String cf) {
        this.cf = cf;
    }
    
    public static String searchPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indicami il Codice Fiscale per cui cercare dentro la map");
        String searchKey = scanner.nextLine();
        return searchKey;
        
    }

}
