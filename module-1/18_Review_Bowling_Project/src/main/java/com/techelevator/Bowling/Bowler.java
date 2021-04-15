package com.techelevator.Bowling;

import java.util.ArrayList;

public class Bowler {
private int teamNumber; // represents the team number the bowler is a member of
private int bowlerNumber;
private String bowlerName;
private ArrayList<Integer> scores;

public Bowler(int teamNumber, int bowlerNumber, String bowlerName, ArrayList<Integer> scores) {
	this.teamNumber 	= teamNumber; // we need this. to reference the data member since parameter name is the same
	this.bowlerNumber 	= bowlerNumber;
	this.bowlerName 	= bowlerName;
	this.scores			= scores;

}

public int getTeamNumber() {
	return teamNumber;
}

public void setTeamNumber(int teamNumber) {
	this.teamNumber = teamNumber;
}

public int getBowlerNumber() {
	return bowlerNumber;
}

public void setBowlerNumber(int bowlerNumber) {
	this.bowlerNumber = bowlerNumber;
}

public String getBowlerName() {
	return bowlerName;
}

public void setBowlerName(String bowlerName) {
	this.bowlerName = bowlerName;
}

public ArrayList<Integer> getScores() {
	return scores;
}

public void setScores(ArrayList<Integer> scores) {
	this.scores = scores;
}

// Define methods to get derived from this class for sum & average
// method names for derived values are prefixed w/ the word get followed by the name of the derived value
// method to return the sum of the scores as an int

public int getSum() { // All of the data we need is in the class, so no parameters are needed
	int sum = 0;  	 // define a variable for the return value
	
					// loop through the ArrayList of scores adding each score to sum
	for(int i=0; i < scores.size(); i++) {
		sum = sum + scores.get(i); // add the current element to sum
	}
	return sum;    // return the variable w/ the result
}
	
// method to return the average of the scores of the scores as a double
public double getAverage() { // All of the data we need is in the class, so no parameters are needed
	double avg = 0;   // define a variable to hold the result
	
					  // to determine average we need to divide the sum of the scores by the number of scores
	avg = this.getSum() / scores.size(); // using a member method to determine a value you need
	
	return avg;       // return the result
	
/* Alternate or re-factored way to code getAverage()
 * return this.getSum() / scoresc.size();
 */
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bowlerName == null) ? 0 : bowlerName.hashCode());
	result = prime * result + bowlerNumber;
	result = prime * result + ((scores == null) ? 0 : scores.hashCode());
	result = prime * result + teamNumber;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Bowler other = (Bowler) obj;
	if (bowlerName == null) {
		if (other.bowlerName != null)
			return false;
	} else if (!bowlerName.equals(other.bowlerName))
		return false;
	if (bowlerNumber != other.bowlerNumber)
		return false;
	if (scores == null) {
		if (other.scores != null)
			return false;
	} else if (!scores.equals(other.scores))
		return false;
	if (teamNumber != other.teamNumber)
		return false;
	return true;
}

@Override
public String toString() {
	return "Bowler [teamNumber=" + teamNumber + ", bowlerNumber=" + bowlerNumber + ", bowlerName=" + bowlerName
			+ ", scores=" + scores + ", getTeamNumber()=" + getTeamNumber() + ", getBowlerNumber()=" + getBowlerNumber()
			+ ", getBowlerName()=" + getBowlerName() + ", getScores()=" + getScores() + ", hashCode()=" + hashCode()
			+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
}

}
