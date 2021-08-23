package org.ssglobal.training.codes;

import java.util.Arrays;

public class GradeBook {

	private double grades[] = new double[0];
	
	public void addGrade(double grade) {
		double[] temp = new double[grades.length + 1];
		System.arraycopy(grades, 0, temp, 0, grades.length);
		temp[grades.length] = grade;
		grades = null;
		grades = temp;
		temp = null;
	
	}
	
	public void delGrade(double grade) {
		int counter = 0;
		for(double data: grades) {
			if (data == grade) {
				counter++;
			}
		}
		
		double[] temp = new double[grades.length - counter]; 
		
		int i = 0;
		for(double data: grades) {
			if (data != grade) {
				temp[i] = data;
				i++;
			}
		}
		grades = null;
		grades = temp;
		temp = null;
		
	}
	
	public void printGrades() {
		Arrays.stream(grades).forEach((grade) -> {
			System.out.println(grade);});
	}
}
