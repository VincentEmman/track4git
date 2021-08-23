package org.ssglobal.training.codes;
 
public class WaterPipe {
	
	public void computeVolume(double d, double v) {
		
		// Computation
		double volumeflow = (d / 2) * (d / 2) * Math.PI * v;
		System.out.printf("Diameter: \t\t %.3f \n",d);
		System.out.printf("Velocity: \t\t %.3f \n",v);
		System.out.printf("Volumetric Flow Rate: \t %.3f \n",volumeflow);
		System.out.println("--------------------------------");
	}
}
