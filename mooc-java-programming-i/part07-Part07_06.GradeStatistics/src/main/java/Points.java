
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
    
    public double passPercentage() {
        int passed = 0;
        
        for (int point: this.points) {
            if (point >= 50) {
                passed += 1;
            }
        }
        
        return 100*(double)passed/this.points.size();
    }
    
    public void gradeDistribution() {
        String star = "*";
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;
        
        for (int point: this.points){
            if (point < 50) {
                grade0 += 1;
            } else if (point < 60) {
                grade1 += 1;
            } else if (point < 70) {
                grade2 += 1;
            } else if (point < 80) {
                grade3 += 1;
            } else if (point < 90) {
                grade4 += 1;
            } else {
                grade5 += 1;
            }
        }
        
        System.out.println("Grade distribution:");
        System.out.print("5: ");
        
        for (int i = 0; i < grade5; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("4: ");
        
        for (int i = 0; i < grade4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("3: ");
        
        for (int i = 0; i < grade3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("2: ");
        
        for (int i = 0; i < grade2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("1: ");
        
        for (int i = 0; i < grade1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("0: ");
        
        for (int i = 0; i < grade0; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public static void printStars(int number){
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
