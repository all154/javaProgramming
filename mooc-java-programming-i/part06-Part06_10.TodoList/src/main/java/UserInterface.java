
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")){
                break;
            } else if (command.equals("add")) {
                this.list.add(command);
            } else if (command.equals("list")) {
                this.list.print();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scanner.nextLine());
                this.list.remove(index);
            }
        }
    }
}
