/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * Karel walks to the door of its house, picks up the
 * newspaper (represented by a beeper, of course), and then returns
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {
	
	// You fill in this part
	public void run() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		pickBeeper();
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnAround();
	}
	
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
	
}
