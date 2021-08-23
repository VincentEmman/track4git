package org.ssglobal.training.codes;

public class TestAlphaSymbol {

	public static void main(String[] args) {
		
		AlphaSymbol as = new AlphaSymbol();
		System.out.println(as.sumWordValue("Hello"));
		System.out.println(as.sumWordValue("World"));
		System.out.println(as.sumWordValue("Vincent"));
		System.out.println(as.sumWordValue("Emmanuel"));
		System.out.println(as.sumWordValue("Salibio"));
	}
}
