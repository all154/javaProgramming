
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        
        for (int i: array){
            if (i < smallest){
                smallest = i;
            }
        }
        
        return smallest;
    }

}
