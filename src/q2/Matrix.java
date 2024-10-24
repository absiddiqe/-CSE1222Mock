package q2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Matrix {
    private String[][] grid;
    private int numRows;
    private int numColum;

    public Matrix(int numRows, int numColum) {
        this.numRows = numRows;
        this.numColum = numColum;
        grid = new String[numRows][numColum];
    }
    public void Set(int row, int column, String description) {
        if(row >= 0 && row < numRows && column >= 0 && column < numColum) {
            grid[row][column] = description;
        }
    }

    public String get(int row, int column) {
        if(row >= 0 && row < numRows && column >= 0 && column < numColum) {
            return grid[row][column];
        }
        return "";
    }

    public ArrayList<Cell> getDescribedCells () {
        ArrayList<Cell>  indexs = new ArrayList<>();
        for(int row = 0; row < numRows; row++) {
            for(int column = 0; column < numColum; column++) {
                if(grid[row][column] != null) {
                    indexs.add(new Cell(row, column));
                }

            }
        }
        return indexs;
    }
}
