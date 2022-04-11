
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while (i < number){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int line = 1;
        
        while (line <= size) {
            int countSpaces = 0;
            int countStars = 0;
            
            while (countSpaces < size - line) {
                System.out.print(" ");
                countSpaces++;
            }
            
            while (countStars < line) {
                System.out.print("*");
                countStars++;
            }
            
            System.out.println("");
            line++;
        }
    }

    public static void christmasTree(int height) {
        int line = 1;
        
        while (line <= height) {
            int countSpaces = 0;
            int countStars = 0;
            
            while (countSpaces < height - line) {
                System.out.print(" ");
                countSpaces++;
            }
            
            while (countStars < 2 * (line-1) + 1) {
                System.out.print("*");
                countStars++;
            }
                     
            System.out.println("");
            line++;
        }
        
        for (int i=0; i < 2; i++) {
            for (int spaces = 0; spaces < height - 2; spaces++){
                System.out.print(" ");
            }
            for (int stars = 0; stars < 3; stars++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);

    }
}
