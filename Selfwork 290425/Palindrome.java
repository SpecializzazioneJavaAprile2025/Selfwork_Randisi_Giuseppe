import java.util.Scanner;
import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una Frase da Controllare");
        String phrase = scanner.nextLine();

        String phrase_start = phrase.replaceAll("[\\W\\s]", "").toLowerCase();
        
        String phrase_reverse = new StringBuilder(phrase_start).reverse().toString();

        System.out.println("la tua frase è:" + phrase_start);
        System.out.println("la tua frase al contrario è:" + phrase_reverse);
        System.out.println("La tua Frase è Palindroma? :" + phrase_start.equals(phrase_reverse));
        scanner.close();  
    }
}
