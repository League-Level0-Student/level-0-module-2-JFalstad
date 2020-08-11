
package _99_extra;

import javax.swing.JOptionPane;

/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown or the rocket won't launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for '11': 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) throws InterruptedException {
		// 2. Use a pop-up to ask the user where to start counting from
		JOptionPane.showInputDialog("Where do you want to start counting from?");
		// 3. Change the countdown to use the new starting point
		for (int i = 10; i >= 0; i--) {
		JOptionPane.showMessageDialog(null, i);
		Thread.sleep(1000);
}
		// 1. Print a countdown from 10 to 0 on the console
		JOptionPane.showMessageDialog(null, "Blastoff!");
		Thread.sleep(1000);
		
		// 5. when the counting is done, use a joptionpane to show "blastoff!"
	   	 }
  }



