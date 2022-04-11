
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int sum = 0;
        int numberOfNumbers = 0;
        int even = 0;
        int odd = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
            
            sum += number;
            numberOfNumbers += 1;
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + (double) sum/numberOfNumbers);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
    }
}
