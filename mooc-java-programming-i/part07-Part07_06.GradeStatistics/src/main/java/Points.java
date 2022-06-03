
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
    
    public double average() {
        int sum = 0;
        
        for (int point: this.points) {
            sum += point;            
        }
        
        return (double) sum / this.points.size();
    }
    
    public String passingAverage() {
        int sum = 0;
        int passed = 0;
        
        for (int point: this.points) {
            if (point >= 50) {
                sum += point;
                passed += 1;
            }
        }
        
        if (sum == 0) {
            return "-";
        } else {
            double average = sum / passed;
            return "".valueOf(average);
        }
    }
    
}
