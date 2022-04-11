
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumOfNumbers = 0;
        int numberOfNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            } else if (number > 0) {
                sumOfNumbers = sumOfNumbers + number;
                numberOfNumbers = numberOfNumbers + 1;
            }
        }
        
        if (numberOfNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: "
                    + (double) sumOfNumbers/numberOfNumbers);
        }

    }
}
