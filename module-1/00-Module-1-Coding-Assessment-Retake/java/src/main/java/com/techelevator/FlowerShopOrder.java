package com.techelevator;

public class FlowerShopOrder {
	private String BouquetType;
	private int numOfRoses;
	private double subTotal;
	
	
	public FlowerShopOrder (String BouquetType, int numOfRoses) {
	      this.BouquetType = BouquetType;
	      this.numOfRoses = numOfRoses;
	      this.subTotal = 19.99 + (2.99*numOfRoses); 
	}
	public double CalculateDeliveryTotal(boolean sameDayDelivery, String zipCode) {
	double deliveryTotal = 0;
	// compareTo returns 0 if strings are equal, > 0 if first string > the 2nd, < 0 if 1st < 2nd
	if (zipCode.compareTo("19999") > 0 && zipCode.compareTo("30000") < 0) {
		deliveryTotal=3.99;
		if (sameDayDelivery) {
			deliveryTotal= deliveryTotal+5.99;
		}
	}
	else if (zipCode.compareTo("29999") > 0 && zipCode.compareTo("40000") < 0) {
		deliveryTotal=5.99;
		if (sameDayDelivery) {
			deliveryTotal= deliveryTotal+5.99;
		}
	}
	else if (zipCode.compareTo("9999") > 0 && zipCode.compareTo("20000") < 0) {
		deliveryTotal=0;
	}
	else {
		deliveryTotal=19.99;
	}
	
	return deliveryTotal;
	
	}
//	Access return type method name (parameters)
	public String toString() {
		String result = "";
		
		result = "order - " + BouquetType + " - " + numOfRoses + " Roses - " + subTotal;
		
		return result;
	}

}




		 