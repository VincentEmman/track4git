package org.ssglobal.training.codes;

public class TestTriangle {

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.compute(3, 4, 5);
		tri.compute(10, 4, 9);
		tri.compute(100, 1000, -10000);
		tri.compute(3.5, 7.5, 5.8);
		tri.compute(100, 1, 1);
	}
}
