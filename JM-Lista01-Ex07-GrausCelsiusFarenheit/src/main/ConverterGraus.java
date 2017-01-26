package main;

public class ConverterGraus {

	public double convCelparaFa(double cel){
		//C = (5 * (F-32) / 9).
		double fa;
		fa = ((cel/5) * 9) + 32;
		
		return fa;
		
	}
}
