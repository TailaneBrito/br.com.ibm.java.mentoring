package main;

public class ConverterGraus {

	public double convFaparaCel(double fa){
		//C = (5 * (F-32) / 9).
		double cel = (5 * (fa-32)/9);
		
		return cel;
		
	}
}
