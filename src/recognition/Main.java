package recognition;
import java.util.*;

public class Main {


    public static void main(String[] args) {

       Grid grid = new Grid("XXXX_XXXX");

       int[] valueGrid = grid.getGrid();
       int output = evaluateOutput(valueGrid);
       if (output > 0) System.out.println("This number is 0");
       else if (output < 0) System.out.println("This number is 1");
    }

    private static int evaluateOutput(int[] inputGrid) {
        int[] w = {2, 1, 2, 4, -4, 4, 2, -1, 2};
        int b = -5;
        int output = 0;
        for (int i = 0; i < inputGrid.length; i++) {
            output += (inputGrid[i] * w[i]);
        }
        output += b;
        return output;
    }
}
