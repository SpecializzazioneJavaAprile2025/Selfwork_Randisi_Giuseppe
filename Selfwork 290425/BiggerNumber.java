import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BiggerNumber {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti Numeri Vuoi Usare? ");
        int howMany = scanner.nextInt();

        int[] numbers = new int[howMany];

        for (int i=0; i<howMany; i++ ){
            System.out.println("Inserisci un numero: ");
            numbers[i] = scanner.nextInt();
        }
        
        String numbersaArray = Arrays.toString(numbers);
        int max = Arrays.stream(numbers).max().getAsInt();
        
   

        System.out.println("I numei Inseriti Sono Stati: " + numbersaArray);
        System.out.println("Il numero pià grande è: " + max);
        
    scanner.close();

    }
}