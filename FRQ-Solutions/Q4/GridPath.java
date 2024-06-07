/*
  Annie was here :)
*/
import java.util.*;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  /**
  * Returns the Location representing a neighbor of the gr as described in part (a)
  *row and col do not specify the element in the last row
  */
  public Location getNextLoc(int row, int col) {
    if(row == grid.length - 1){
      return new Location(row, col+1);
    }else if(col == grid[0].length -1){
      return new Location(row+1, col);
    }else if(grid[row][col+1] < grid[row+1][col]){
      return new Location(row, col+1);
    }
    return new Location(row+1, col);
   }

  
  /**
  * Computes and returns the sum of all values on a path through grid, as described in
  * Preconditions: row is a valid row index and col is a valid column index in grid. row and col do not specify the element in the last row and last column of grid.
  */
  public int sumPath(int row, int col) {
    int sum = 0;
    while(!(row == grid.length-1 && col == grid[0].length-1 )){
      sum = sum + grid[row][col];
      Location loc = getNextLoc(row, col);
      System.out.println("loc: " + loc);
      row = loc.getRow();
      col = loc.getCol();
      //System.out.println(row + " " + col);
    }
    sum += grid[row][col];
    return sum;
    }

  // ANNIE WAS HERE!!!
  // ebby was here >:D
  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
    
  }
}
