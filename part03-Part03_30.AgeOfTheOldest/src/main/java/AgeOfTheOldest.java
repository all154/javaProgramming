
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOfTheOldest = 0;
        
        while (true) {
            String text = scanner.nextLine();
            
            if (text.equals("")){
                break;
            } else {
                String[] parts = text.split(",");
                
                if (ageOfTheOldest < Integer.valueOf(parts[1])){
                    ageOfTheOldest = Integer.valueOf(parts[1]);
                }
            }            
        }
        
        System.out.println("Age of the oldest: " + ageOfTheOldest);

    }
}
