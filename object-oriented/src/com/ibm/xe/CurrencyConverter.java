package com.ibm.xe;

public class CurrencyConverter {
	double converter(double amount, Currency source, Currency target) {
		double rate = target.dollarValue()/ source.dollarValue();
		return rate * amount;
	}

}
