
import java.util.ArrayList;


public class Points {
    private ArrayList<Integer> points;
    
    public Points() {
        this.points = new ArrayList<>();
    }
    
    public void add(int point) {
        if (point <= 100 && point >= 0) {
            this.points.add(point);
        }
    }
    
    public int average() {
        int sum = 0;
        
        for (int point: this.points) {
            sum =+ point;            
        }
        
        return sum / this.points.size();
    }
    
}
