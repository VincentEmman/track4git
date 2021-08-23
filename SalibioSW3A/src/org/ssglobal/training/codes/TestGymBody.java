package org.ssglobal.training.codes;

public class TestGymBody {

	public static void main(String[] args) {
		GymBody gb = new GymBody();
		gb.calculateBMI(220, 68);
		gb.calculateBMI(150.5, 76.4);
		gb.calculateBMI(0, -20);
		gb.calculateBMI(200.12, 78.7);
		gb.calculateBMI(-220, 68);
	}
}
