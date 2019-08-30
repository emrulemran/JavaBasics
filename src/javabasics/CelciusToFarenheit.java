package exceptionsdemo;

public class CelciusToFarenheit {

	// business logic: conversion from F to C
	// input: temp in C
	// output: F
	// relationship: F = (1.8 * CelciusValue) + 32
	// methodName: CtoFConversion()
	// param: value in C

	public static void main(String[] args) {
		System.out.println(CtoFConversion(42));

	}

	public static double CtoFConversion(double Celcius) {
		double F = (1.8 * Celcius) + 32;
		return F;
	}

}
