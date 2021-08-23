package org.ssglobal.training.codes;

public class TestSalesCommission {

	public static void main(String[] args) {
		
		SalesCommission sc = new SalesCommission();
		sc.monetize(1200,100);
		sc.monetize(102.31,100.50);
		sc.monetize();
		sc.monetize(100,200,300,400);
		sc.monetize(99.50,200,300,400);
	}

}
