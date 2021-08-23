package org.ssglobal.training.codes;

public class TestWaterPipe {

	public static void main(String[] args) {
		
		WaterPipe wp = new WaterPipe();
		wp.computeVolume(3, 12);
		wp.computeVolume(3.9, 12.5);
		wp.computeVolume(6, 10.8);
		wp.computeVolume(8.5, 11.2);
		wp.computeVolume(9, 12.2);
	}

}
