package com.techelevator;

public class CigarParty {

    /*
     When squirrels get together for a party, they like to have cigars. A squirrel party is successful
     when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
     there is no upper bound on the number of cigars. Return true if the party with the given values is
     successful, or false otherwise.
     haveParty(30, false) => false
     haveParty(50, false) => true
     haveParty(70, true) => true
     */
	public boolean cigarParty(int cigars, boolean isWeekend) {
		int MinimumCigarCount = 40;
		int MaximumCigarCount = 60;
		
		Boolean hasMinimumCigars = (cigars >= MinimumCigarCount);
		Boolean withinMaxRangeOfCigars = (!isWeekend && cigars <= MaximumCigarCount) || isWeekend;
		Boolean successful = hasMinimumCigars && withinMaxRangeOfCigars;
		
		return  successful;
	}

	public boolean HaveParty(int cigars1, boolean isWeekend1) {
		// TODO Auto-generated method stub
		return false;
	}
}