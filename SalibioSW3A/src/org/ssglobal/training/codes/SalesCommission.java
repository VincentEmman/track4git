package org.ssglobal.training.codes;

public class SalesCommission {

	public void monetize(double...sales) {
		
		double totsales = 0.0;
		
		if (sales.length == 0) {
			System.out.println("No sales has been inputted \n");
		} else {
			System.out.print("Sales: ");
			
			for(double lookup:sales) {
				System.out.print(" " + lookup + " ");
				totsales += lookup;
			}
		
		double commission = (totsales>=1000)? 0.08*totsales:0.0;
		
		System.out.printf("\nThe commission is: %.2f \n\n", commission);
		}
	}
}
