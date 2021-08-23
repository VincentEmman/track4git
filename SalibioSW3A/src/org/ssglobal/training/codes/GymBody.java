package org.ssglobal.training.codes;

public class GymBody {

	public void calculateBMI(double weight, double height) {
		double bmi = getBMI(weight, height);
		String bodytype = getBodyType(bmi);
		System.out.println("This program will calculate "
				+ "your body mass index, or BMI.");
		System.out.printf("Enter your weight, in pounds: %.1f\n",weight);
		System.out.printf("Enter your height, in inches: %.1f\n",height);	
		System.out.printf("Your body mass index (BMI) is %f\n",bmi);
		System.out.printf("Your weight is %s\n",bodytype);			
	}
	
	public double getBMI(double weight, double height) {
		double bmi = 0.0;
		if(weight <=0 || height <=0){
			System.out.println("Invalid inputs");
		} else {
			 bmi = (double) (weight * 703)/(height*height);
		}
		return bmi;
	}
	
	public String getBodyType(double bmi) {
		if(bmi <= 0.0) {
			return "Invalid bmi";
		} else {
			if (bmi > 25) {
				return "overweight";
			} else {
				if (bmi >= 18.5 && bmi<=25) {
					return "optimal weight";
				} else {
						return "underweight";
				  }	
			}
		}
	}
}