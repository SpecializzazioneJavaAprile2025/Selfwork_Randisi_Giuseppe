import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {

    
    public static void main(String[] args) throws Exception {
        String name1 ="Giuseppe";
        String name2 ="Anna";
        String name3 ="Franco";
        String name4 ="Rachele";
        String name5 ="Nicola";
        
        // System.out.println(nameMoreThan5(name1));
        // System.out.println(nameMoreThan5(name2));
        // System.out.println(nameMoreThan5(name3));
        // System.out.println(nameMoreThan5(name4));
        // System.out.println(nameMoreThan5(name5));
        //System.out.println(getLength(name5));
        //printUpperCase(name5);
        //defaultStrings().forEach(System.out::println);
    }
    //Fuzione Programma: Determinare se Stringa ha pù di 5 lettere
    // public static boolean nameMoreThan5(String name){
    // Predicate<String> check = n -> n.length() > 5;
    // return check.test(name);    
    // }
    
    //Funzione per Restituire Lunghezza Stringa
    // public static int getLength(String stringa){
    // Function <String, Integer> length = s -> s.length();
    //     return length.apply(stringa);
    // }

    //Funzione per stampare stringa in Maiuscolo<
    // public static void printUpperCase(String string){
    //     Consumer<String> upperCase = s -> System.out.println(s.toUpperCase());
    //     upperCase.accept(string);
    //     }

    //Funzione che stampi Set di Parole Predefinite
    // public static List<String> defaultStrings(){
    //     Supplier<List<String>> wordSupplier = () -> List.of("Battiato","Bocelli", "Venditti");
    //     List<String> words = wordSupplier.get();
    //     return words;
    // }
    }
