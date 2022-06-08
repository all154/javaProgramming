
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        Birds birds = new Birds();

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("Add")) {
                birds.add(scanner);
            }

            if (command.equals("Observation")) {
                birds.observation(scanner);
            }

            if (command.equals("All")) {
                birds.all();
            }

            if (command.equals("Quit")) {
                break;
            }
        }
    }

}
