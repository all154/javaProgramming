
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void start() {
        Points points = new Points();
        
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());

            if (point == -1) {
                System.out.println("Point average (all): " + points.average());
                System.out.println("Point average (passing): " + points.passingAverage());
                break;
            }
            
            points.add(point);
        }
    }
}
