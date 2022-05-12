
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
}
