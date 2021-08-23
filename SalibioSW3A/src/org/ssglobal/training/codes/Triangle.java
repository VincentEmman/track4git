package org.ssglobal.training.codes;

public class Triangle {

	public void compute(double a, double b, double c) {
		
		double s = 0.5 * (a + b + c);
		boolean sResult = (a < s && b < s && c < s)? true:false;
		if (sResult == true) {
			double area = Math.sqrt(s * (s - a)*(s - b)*(s - c));
			System.out.printf("The area of the triangle with sides: "
					+ "%.2f-%.2f-%.2f is %.4f square units. \n", a, b, c, area);
		} else {
			System.out.println("Invalid sides of triangle");
		}
	}
}
