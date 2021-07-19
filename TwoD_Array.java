package Arrays;
import java.util.Arrays;
public class TwoD_Array {
    public static void main(String[] args) {
        int[][] TWO_D_ARRAY = new int[2][2];
        TWO_D_ARRAY[0][0] = 1;
        TWO_D_ARRAY[0][1] = 2;
        TWO_D_ARRAY[1][0] = 3;
        TWO_D_ARRAY[1][1] = 4;
        
        System.out.print(Arrays.deepToString(TWO_D_ARRAY));
    }
}
