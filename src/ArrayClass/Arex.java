package ArrayClass;

import java.util.TreeSet;

public class Arex {

    public static void main(String[] args) {
        
        int[] ar = {1, 4, 3, 1, 7, 9, 1, 4, 6, 3};
        
        // Creating a TreeSet to remove duplicates and sort the elements
        TreeSet<Integer> t = new TreeSet<Integer>();
        
        // Adding elements from the array to the TreeSet
        for (int i = 0; i < ar.length; i++) {
            t.add(ar[i]);
        }
        
        // Convert the TreeSet to an array
        Integer[] uniqueSortedArray = t.toArray(new Integer[0]);
        
        System.out.println(uniqueSortedArray);

        // Print the array
        System.out.println("Array after removing duplicates and sorting: ");
        for (int num : uniqueSortedArray) {
            System.out.print(num + " ");
        }
    }
}

