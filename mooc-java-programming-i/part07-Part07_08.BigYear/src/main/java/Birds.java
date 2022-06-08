
import java.util.ArrayList;
import java.util.Scanner;


public class Birds {
    private ArrayList<Bird> birds;
    
    public Birds(){
        this.birds = new ArrayList();
    }
    
    public void add(Scanner scan){
        System.out.println("Name:");
        String name = scan.nextLine();
        System.out.println("Name in Latin:");
        String latinName = scan.nextLine();
        
        this.birds.add(new Bird(name, latinName));
    }
    
}