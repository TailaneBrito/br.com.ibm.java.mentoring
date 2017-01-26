package main;

public class IMC {

	public void calcIMC(double alt, double pes){
	  
		double imc = pes / (alt * alt);
	  
		if(imc < 18.5){
			System.out.println("Abaixo do peso");
		}else if(imc <=25){
			System.out.println("Peso Normal");
		}else if(imc <= 30){
			System.out.println("Acima do Peso");
		}else{
			System.out.println("Obeso");
		}
		 
		
	}
}
