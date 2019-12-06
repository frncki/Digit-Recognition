package recognition;

class Grid {
    private int gridLength;
    private String[] inputGrid;
    private int[] grid;

    Grid(int x, int y, String input) {
        gridLength = x * y;
        inputGrid = input.split("");
        grid = new int[gridLength];
    }

    int[] getGrid() {
        for (int i = 0; i < gridLength; i++) {
            if (inputGrid[i].equals("X")) grid[i] = 1;
            else grid[i] = 0;
        }
        return grid;
    }
}
