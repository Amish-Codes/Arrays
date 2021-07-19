package Arrays;
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        int[]  array = new int[5]; // O(1)

        // array[0]=1; array[1]=2; array[2]=3; // single O(1) all O(N)

        System.out.println(Arrays.toString(array)); // by default it will set 0

        // all together
        String[] arr = {"a","b","c"}; // O(1)
        System.out.println(Arrays.toString(arr));


    }
    
}
