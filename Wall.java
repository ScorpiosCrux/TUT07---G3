/**
 * The Wall class contains the variable and methods of Wall objects
 */

import java.awt.Point;
import java.util.ArrayList;

public class Wall {

	// instance variables
	private int[][] walls;
	private int[][] level1 ={{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
							 {1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1},
							 {1,0,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1,0,0,0,0,1,1},
							 {1,0,1,1,0,0,0,0,1,0,1,0,1,1,1,1,1,0,0,1,0,0,0,1,0,1,0,1,1,1,1,1},
							 {1,0,0,0,0,1,1,0,1,0,0,0,1,0,0,0,0,1,1,0,0,1,0,1,0,1,0,1,1,1,1,1},
							 {1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,0,0,1,1,0,1,0,1,0,1,1,1,1,1},
							 {1,0,0,0,0,0,0,0,1,0,0,0,1,0,1,1,0,0,0,1,1,1,0,1,0,1,0,0,0,0,1,1},
							 {1,0,1,1,1,1,1,0,1,0,1,0,0,0,0,0,1,1,1,1,1,1,0,1,0,1,1,1,1,0,0,1},
							 {1,0,1,1,1,1,1,0,1,0,0,1,1,0,1,0,1,0,1,0,0,0,0,1,0,1,0,0,0,1,0,1},
							 {1,0,1,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,0,0,1,0,1,0,1},
							 {1,0,0,1,1,0,0,0,1,0,0,0,0,1,1,0,0,0,1,0,1,1,1,1,1,1,1,1,0,1,0,1},
							 {1,1,0,1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,1,0,1},
							 {1,1,0,1,1,0,0,0,0,0,1,0,1,0,1,1,1,0,0,1,1,1,0,1,1,0,0,1,1,1,0,1},
							 {1,1,0,1,1,0,1,0,1,0,1,0,0,0,0,0,0,1,0,0,1,1,0,1,1,0,1,1,1,0,0,1},
							 {1,0,0,1,1,1,1,0,1,1,1,0,1,1,0,1,0,1,1,0,1,1,0,1,1,0,1,1,1,0,1,1},
							 {1,0,1,0,0,0,1,0,0,0,1,0,1,1,0,1,0,0,0,0,0,0,0,1,1,0,1,1,1,0,1,1},
							 {1,0,1,0,1,0,1,1,1,1,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1},
							 {1,0,1,0,1,0,0,0,0,0,0,0,1,1,0,1,0,0,1,1,0,0,0,0,0,0,1,1,1,0,1,1},
							 {1,0,1,0,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,0,1,1,1,1,1,0,0,0,0,1,1},
							 {1,0,1,0,0,0,0,0,0,1,1,1,0,0,1,1,1,1,1,1,0,1,1,1,0,1,1,0,1,0,1,1},
							 {1,0,1,0,1,1,1,1,1,1,0,0,0,1,1,1,0,0,0,0,1,1,1,0,0,0,1,0,1,0,1,1},
							 {1,0,1,0,1,0,0,0,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,0,1,0,1,0,1,0,1,1},
							 {1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,1,0,1,0,1,0,1,1},
							 {1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,0,1,0,1,0,0,1},
							 {1,0,1,1,0,0,0,0,1,1,1,1,1,1,0,0,0,1,1,1,0,0,0,0,1,0,1,0,1,1,1,1},
							 {1,0,0,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0,1,1,1,1,1,1,0,1,0,0,0,0,1},
							 {1,1,0,1,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,0,1,1,1,0,1,0,1,1,1,1,0,1},
							 {1,1,0,1,1,1,0,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,0,0,0,1,1,0,1},
							 {1,1,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,1,0,1,0,0,1,0,1},
							 {1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,0,0,1,1,1,0,1,1,1,1,0,1},
							 {1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,0,0,0,0,0,0,1},
							 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};



	// constructor
	public Wall(int rows, int columns) {
		this.walls = new int[rows][columns];
		this.generateBorder(rows, columns);
	}


	/**
	 * Adds all the outer coordinates of the level into the instance variable location
	 * Requires the height and width of the level
	 * @param height the height of the level
	 * @param width the width of the level
	 */
	public void generateBorder(int rows, int columns) {
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++ ) {
				if (((row == 0) || (row == rows-1)) || ((column == 0) || (column == columns-1))) {
					walls[row][column] = 1;
				}
			}
		}
	}
	
	/**
	 * Getter for the point's location
	 * @return Arraylist of type Point
	 */
	public int[][] getWalls() {
		return this.level1;
	}













}
