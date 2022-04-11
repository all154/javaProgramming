
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageOfTheOldest = 0;
        String nameOfTheOldest = "";
        
        while (true) {
            String text = scanner.nextLine();
            
            if (text.equals("")){
                break;
            } else {
                String[] parts = text.split(",");
                
                if (ageOfTheOldest < Integer.valueOf(parts[1])){
                    ageOfTheOldest = Integer.valueOf(parts[1]);
                    nameOfTheOldest = parts[0];
                }
            }            
        }
        
        System.out.println("Name of the oldest: " + nameOfTheOldest);


    }
}
