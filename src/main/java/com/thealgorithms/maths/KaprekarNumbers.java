package com.thealgorithms.maths;

public class KaprekarNumbers {
	

	/* This program demonstrates if a given number is Kaprekar Number or not.
	Kaprekar Number: A Kaprekar number is an n-digit number which its square can be split into two parts where the right part has n
	digits and sum of these parts is equal to the original number. */


	// Checks whether a given number is Kaprekar Number or not

	public static boolean isKaprekarNumber(long number) {			
		long numberSquared = number * number;
		if(Long.toString(number).length() == Long.toString(numberSquared).length()){
			return (number == numberSquared);
		}
		else{
			long leftDigits1 = 0, leftDigits2 = 0;
			if(Long.toString(numberSquared).contains("0")){
				leftDigits1 = Long.parseLong(Long.toString(numberSquared).substring(0, Long.toString(numberSquared).indexOf("0")));
			}
			leftDigits2 = Long.parseLong(Long.toString(numberSquared).substring(0, (Long.toString(numberSquared).length() - Long.toString(number).length())));
			long rightDigits = Long.parseLong(Long.toString(numberSquared).substring(Long.toString(numberSquared).length() - Long.toString(number).length()));
			return (number == (leftDigits1 + rightDigits)) || (number == (leftDigits2 + rightDigits));
		}		
	}

}
