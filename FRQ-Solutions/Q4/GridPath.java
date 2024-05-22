/*
  Annie was here :)
*/
import java.util.*;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
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

  
  // PART B
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
