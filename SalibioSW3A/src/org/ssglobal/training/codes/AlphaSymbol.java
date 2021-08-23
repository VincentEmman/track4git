package org.ssglobal.training.codes;

public class AlphaSymbol {
	
	public int sumWordValue(String word) {
		
		System.out.printf("The total ASCII value of the word %s is: ", word);
		int sum = 0;
		for (int i = 0; i < word.length(); i++)
			// Calculations
			sum += (int) word.charAt(i);
		return sum;
	}
}
