/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		while (frontIsClear()) {
			turnLeft();
			while (frontIsClear()) {
				MoveUp();
			}
		turnAround();
		CheckForBeeper();
		MoveDown();
		turnLeft();
		MoveForward();
	}
		if (frontIsBlocked()) {
			turnLeft();
			while (frontIsClear()) {
				MoveUp();
			}
		turnAround();
		CheckForBeeper();
		MoveDown();
		turnLeft();
		}
	}	
	
	private void MoveUp() {
		if (beepersPresent()) {
			move();
		} else {
			putBeeper();
		}
	}
	
	private void CheckForBeeper() {
		if (beepersPresent()) {
			move();
		} else {
			putBeeper();
		}
	}
	
	private void MoveDown() {
		while (frontIsClear()) {
			move();
		}
	}
	
	private void MoveForward() {
		for (int i=0; i<4; i++) {
			move();
		}
	}
	

}
