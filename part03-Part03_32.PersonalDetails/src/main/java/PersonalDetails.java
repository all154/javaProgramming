
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int sum = 0;
        int names = 0;
        
        while (true) {
            String text = scanner.nextLine();
            
            if (text.equals("")){
                break;
            } else {
                String[] parts = text.split(",");
                
                if (parts[0].length() > longestName.length()){
                    longestName = parts[0];
                }
                
                sum += Integer.valueOf(parts[1]);
                names += 1;
                
            }            
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double) sum/names);
        
    }
}
