package recognition;

class Grid {
    private String[] inputGrid;
    private int[] grid;

    Grid(String input) {
        inputGrid = input.split("");
        grid = new int[inputGrid.length];
    }

    int[] getGrid() {
        for (int i = 0; i < inputGrid.length; i++) {
            if (inputGrid[i].equals("X")) grid[i] = 1;
            else grid[i] = 0;
        }
        return grid;
    }
}
