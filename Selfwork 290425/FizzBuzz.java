import java.util.Scanner;
import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indicami il numero Massimo: ");
        int max = scanner.nextInt();
        System.out.println("////-----Iniziamo-----////");

        for (int i=1; i <= max; i++ ){
            
            if ( i % 15 == 0) {            
                System.out.println("FizzBuzz");                
            } else if (i % 5 == 0) {                
                System.out.println("Buzz");                    
            } else if (i % 3 == 0) {    
                System.out.println("Fizz");                
            }  else {    
                System.out.println(i);
            };        
        }
    
    }
}

