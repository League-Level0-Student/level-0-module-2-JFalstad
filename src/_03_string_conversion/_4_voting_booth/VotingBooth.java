package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ageInYears = JOptionPane.showInputDialog("How old are you in years?");
		
		int convertedAge = Integer.parseInt(ageInYears);
		
		if( convertedAge >= 18 ) {
			JOptionPane.showMessageDialog(null, "Who do you think the next president will be?");
		}
		
		if( convertedAge < 18 ) {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
	
	
	
	
	}

}
