
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
    
    public static int indexOfSmallest(int[] array){
        int index = 0;
        int smallest = array[0];
        int i = 1;
        
        while (i < array.length){
            if (array[i] < smallest){
                index = i;
                smallest = array[i];
            }
            i++;
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallest = table[startIndex];
        int i = startIndex + 1;
        
        while (i < table.length){
            if (table[i] < smallest){
                index = i;
                smallest = table[i];
            }
            i++;
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        int i = 0;
        int indexOfSmallest = 0;
        
        while (i < array.length) {
            indexOfSmallest = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, indexOfSmallest);
            i++;
        }
    }
    
}
