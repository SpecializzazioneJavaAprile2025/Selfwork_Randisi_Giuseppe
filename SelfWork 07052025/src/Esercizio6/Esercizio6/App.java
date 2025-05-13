package Esercizio6;

import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
    //6- Scrivere un programma che crei una lista di elementi e che ne rimuova i duplicati
       
        //Per quanto scomodo ed inutile, in questo caso creao arbitrariamente io la lista
        
        List<Funko> funkos = Funko.createAndPrint();
        Set<Funko> unique = Funko.removeDuplicates(funkos);
        Funko.print(new ArrayList<>(unique));

        }
    }   

