
import java.util.ArrayList;


public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<> ();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Suitcase object: this.suitcases) {
            totalWeight += object.totalWeight();
        }
        
        return totalWeight;
    }
    
    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
}
