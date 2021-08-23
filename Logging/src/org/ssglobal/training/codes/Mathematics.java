package org.ssglobal.training.codes;

public class Mathematics {

	private Divide divide;

	public Mathematics(Divide divide) {
		this.divide = divide;
	}
	
	public double complexOp(int x, int y) {
		double formula =0.0;
		try {
			formula = (2000.00/divide.div(x, y)) - divide.div(x, y);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return formula;
	}
	
	
}
