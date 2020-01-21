package com.company.Greenlee;

public class Main {
// Trenton Greenlee. 1/14/2020. Exercise 1 (Week 1).
    public static void main(String[] args) {
    	// Variable Declarations and Assignments
	String city = "Columbus";
	int zipCode = 43215;
	double[] highTemperature = {32, 25, 27, 40, 45};
	double total = 0;

	// Using a for loop to determine average temperature of the week.
	for(int i = 0; i < highTemperature.length; i++) {
		total = total + highTemperature[i];
	}

	// Average variable declaration
	double average = total / highTemperature.length;

	// Printing out the name of the city, including its zip code and average temperature.
	System.out.println("City: " + city + "\nZip Code: " + zipCode + "\nAverage High Temperature: " + average);
    }
}
