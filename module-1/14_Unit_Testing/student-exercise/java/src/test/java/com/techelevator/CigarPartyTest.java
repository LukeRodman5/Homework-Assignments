package com.techelevator;

public class CigarPartyTest{

 public static void main(String[] args) {

    CigarPartyTest test = new CigarPartyTest();
    System.out.println(">" + test.cigarParty(30, false) + "<");
    System.out.println(">" + test.cigarParty(50, false) + "<");
    System.out.println(">" + test.cigarParty(70, true) + "<");
  }
 
 public boolean cigarParty(int cigars, boolean isWeekend) {
    if(isWeekend && cigars >= 40) {
      return true;
    }
    else if(cigars >=40 && cigars <= 60) {
      return true;
    }
    else {
      return false;
    }
}
}