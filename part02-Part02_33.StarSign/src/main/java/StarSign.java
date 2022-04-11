
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        String stars = "";
                        
        for (int i=0; i < number; i++){
            stars = stars + "*";
        }
        System.out.println(stars);
    }

    public static void printSquare(int size) {
        String stars = "";
                        
        for (int i=0; i < size; i++){
            stars = stars + "*";
        }
        
        for (int i=0; i < size; i++){
            System.out.println(stars);
        }
        
    }

    public static void printRectangle(int width, int height) {
        String stars = "";
                        
        for (int i=0; i < width; i++){
            stars = stars + "*";
        }
        
        for (int i=0; i < height; i++){
            System.out.println(stars);
        }
    }

    public static void printTriangle(int size) {
        int line = 1;
        
        while (line <= size) {
            int countSpaces = 0;
            int countStars = 0;
            
            while (countSpaces < size - line) {
                System.out.print(" ");
            }
            
            while (countStars < line) {
                System.out.print("*");
            }
            
            System.out.println("");
        }

        }
        
    }

