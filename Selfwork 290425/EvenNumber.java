import java.security.PublicKey;
import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int input = scanner.nextInt();
        
        String result = confronto(input);
        System.out.println("Hai inserito: " + input + " ed è " + result);
        
        scanner.close();
    }
    public static String confronto(int a){
        if (a % 2 == 0) {
            return "Pari";
        } else {
            return "Dispari";
        }
    }
    
}