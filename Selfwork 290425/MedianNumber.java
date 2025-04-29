import java.util.Scanner;
import java.util.Arrays;

public class MedianNumber {

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
        int sumAll = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            sumAll += num;
        

        if (num % 2 == 0){
            sumEven += num;
            countEven++;
        } else {
            sumOdd += num;
            countOdd++;
        }
    }

    double medianAll = (double) sumAll/howMany;
    double medianEven = (double) sumEven/countEven;
    double medianOdd = (double) sumOdd/countOdd;


    System.out.println("I numei Inseriti Sono Stati: " + numbersaArray);
    System.out.println("Media di Tutti i numeri: " + medianAll);
    System.out.println("Media di Tutti i numeri Pari: " + medianEven);
    System.out.println("Media di Tutti i numeri: " + medianOdd);
    
    }
}