
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        
        while (true) {
            String text = scanner.nextLine();
            
            if (text.equals("end")) {
                break;
            }
            
            i++;
        }
        
        System.out.println(i);

    }
}
