
import java.util.ArrayList;


public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    
    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<> ();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item) {
        int totalWeight = 0;
        
        if (this.items.isEmpty() && item.getWeight() <= this.maximumWeight) {
            this.items.add(item);
        } else {
            for (Item object: items) {
                totalWeight += object.getWeight();
            }
            
            if (totalWeight + item.getWeight() <= this.maximumWeight) {
                this.items.add(item);
            }
        }
        
    }
    
}
