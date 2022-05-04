
import java.util.ArrayList;


public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
}
