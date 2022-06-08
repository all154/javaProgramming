
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void start() {
        Birds birds = new Birds();
        
        System.out.println("Command: ");
        String command = scanner.nextLine();
        
        if (command.equals("Add")) {
            birds.add(scanner);
        }
        
    }

}
