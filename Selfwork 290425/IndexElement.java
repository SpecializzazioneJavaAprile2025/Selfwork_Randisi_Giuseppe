import java.util.Scanner;
import java.util.Arrays;

public class IndexElement {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quali Numeri Vuoi Usare? ");
        int chosenNumbers = scanner.nextInt();

        int[] numbers = new int[chosenNumbers];

        for (int i=0; i<chosenNumbers; i++ ){
            System.out.println("Inserisci un numero: ");
            numbers[i] = scanner.nextInt();
        }

        String numbersaArray = Arrays.toString(numbers);
        int[] evenNumbers = new int[chosenNumbers];
        int evenCount = 0;

        for (int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            if (num % 2 == 0){
                evenNumbers[evenCount] = num;
                evenCount++;
            }
        }
        
        String evenArray = Arrays.toString(Arrays.copyOf(evenNumbers, evenCount)); 
        //Elimino Gli Zeri; Viceversa stampa anche quelli.
    
    System.out.println("I numei Inseriti Sono Stati: " + numbersaArray);
    System.out.println("I numeri Pari erano: " + evenArray);
    
    
    scanner.close();
    }
}