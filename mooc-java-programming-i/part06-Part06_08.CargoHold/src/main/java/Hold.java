
import java.util.ArrayList;


public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<> ();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        
        for (Suitcase object: this.suitcases) {
            totalWeight += object.totalWeight();
        }
        
        if (totalWeight + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }
}
