package Arrays;
import java.util.Arrays;
public class TwoD_Array2 {
    int arr[][]=null;

    public TwoD_Array2(int noOfRows, int noOfcolumns) {
        this.arr = new int[noOfRows][noOfcolumns];
        for(int row=0; row<arr.length-1; row++) {
            for(int column=0;column<arr[0].length; column++) {
                arr[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int r, int c, int value) {
        try {
            // if(arr[r][c]==Integer.MIN_VALUE) {
                arr[r][c]=value;
                System.out.println("The value is successfully inserted!");
            // }
            // else {
                // System.out.println("The cell is already occupied!");
            // }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("INvalid index");
        }
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }

    public void access(int r, int c) {
        System.err.println("\nAccessing Row# " + r + ", Col# " + c);
        try{
            System.out.println("searching value is " + arr[r][c]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
    }

    public void traverse() {
        for(int r=0; r<arr.length; r++) {  // O(M)
            for(int c=0; c<arr[0].length; c++) {  // O(N)
                System.out.print(arr[r][c] + " ");  // O(1)
            }
            System.out.println();  // O(1)
        }
    }

    public void search(int value) {
        for(int r=0; r<arr.length;r++) {
            for (int c=0; c<arr[0].length;c++) {
                if (arr[r][c]==value) {
                    System.out.println("value is found at row " + r + " and column " + c);
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }

    public void delete(int r, int c) {
        try {
            System.out.println("successfully deleted!");
            arr[r][c] =Integer.MIN_VALUE;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        TwoD_Array2 obj = new TwoD_Array2(3,3);
        obj.insert(0,0,10);
        obj.insert(0,1,20);
        obj.insert(0,2,30);
        obj.insert(1,0,40);
        obj.insert(1,1,50);
        obj.insert(1,2,60);
        obj.insert(2,0,70);
        obj.insert(2,1,80);
        obj.insert(2,2,90);
        System.out.println(Arrays.deepToString(obj.arr));

        // seaching
        obj.access(0,1);

        // traverse
        obj.traverse();

        // search
        obj.search(50);

        // delete
        obj.delete(1,1);
    }
}