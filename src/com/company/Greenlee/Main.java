package com.company.Greenlee;

public class Main {

    public static void main(String[] args) {
	String city = "Columbus";
	int zipCode = 43215;
	double[] highTemperature = {32, 25, 27, 40, 45};
	double total = 0;

	for(int i = 0; i < highTemperature.length; i++) {
	    total = total + highTemperature[i];
    }

    double averageTemperature = total / highTemperature.length;
    }
}
