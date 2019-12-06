package recognition;

import java.util.*;

public class Stage1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String thirdLine = scanner.nextLine();

        System.out.println("The input is:");
        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);

        Grid grid = new Grid(3 ,3,firstLine + secondLine + thirdLine);

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
