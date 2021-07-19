package Arrays;
import java.util.Arrays;
public class Array2 {
    int [] arr = null;
    public Array2(int size) {
        this.arr = new int[size];
        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) {
        try {
            if(arr[location]==Integer.MIN_VALUE) {   // O(1)
            arr[location]=value;  // O(1)
            System.out.println("Successfully Inserted "+value);  // O(1)
            }
        else {
            System.out.println("This cell is already occupied");  // O(1)
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");  // O(1)
        }
    }

    public void traverse() {
        try {
            for (int element : arr) {  // O(N)
            System.out.print(element + " "); // O(1)
            }
        }
        catch(Exception e) {
            System.out.println("Array no longer exists!"); // 0(1)
        }
        System.out.println();

        // another way
        System.out.println(Arrays.toString(arr));
    }
    
    public void search(int value) {
        for (int i=0; i<arr.length; i++) { // O(N)
            if(arr[i]==value) {  // O(1)
                System.out.println("value found at " + i); // O(1)
                return;
            }
        }System.out.println(value + "not found");  // O(1)
    }

    public void delete(int index) {
        // try {
        //     arr[index] = Integer.MIN_VALUE; // O(1)
        //     System.out.println("Value is successfully deleted"); // O(1)
        // }
        // catch(ArrayIndexOutOfBoundsException e) {
        //     System.out.println("The value is provided is not in the range");  // O(1)
        // }
        System.out.println("Original Array : "+Arrays.toString(arr));
        for(int i = index; i < arr.length -1; i++){
            arr[i] = arr[i + 1];
          }
        System.out.println("After removing the second element: "+Arrays.toString(arr));  
    }
}

class Main {
    public static void main(String[] args) {
        Array2 obj = new Array2(10);
        obj.insert(0,0);
        obj.insert(1,10);
        obj.insert(2,20);
        obj.insert(1,30);
        obj.insert(12,120);

        // accessing elements
        var fisrtElement = obj.arr[0]; //O(1)
        System.out.println(fisrtElement); //O(1)

        // traversing array
        obj.traverse();

        // searching element
        obj.search(10);

        // deleting method
        obj.delete(2);
        obj.traverse();
    }
}