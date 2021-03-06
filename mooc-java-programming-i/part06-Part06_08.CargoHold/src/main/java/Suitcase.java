
import java.util.ArrayList;


public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    
    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<> ();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maximumWeight) {
            this.items.add(item);
        }   
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
    }
    
    public void printItems() {
        for (Item item: this.items){
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        if (this.items.isEmpty()){
            return 0;
        }
        
        int totalWeight = 0;
        
        for (Item item: this.items) {
                totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = new Item("", 0);
        
        for (Item item: this.items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
}
