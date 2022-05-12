
import java.util.ArrayList;


public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
}
