import java.util.Scanner;
import java.util.Arrays;

public class AskUser {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indicami la lunghezza dell'Array ");
        int howMany = scanner.nextInt();

        int[] numbers = new int[howMany];

        for (int i=0; i<howMany; i++ ){
            System.out.println("Inserisci un numero: ");
            numbers[i] = scanner.nextInt();
        }
        String numbersaArray = Arrays.toString(numbers);
        int sumAll = 0;
        
        for (int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            sumAll += num;
    }


    System.out.println("L'Array ha lunghezza: " +  howMany);
    System.out.println("I numei Inseriti Sono Stati: " + numbersaArray);
    System.out.println("La loro somma è uguale a: " + sumAll);
    
    }
}