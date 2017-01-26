package main;

public class IMC {

	public void calcPesoIdeal(String sexo, double alt, double pes){
	  if(sexo.equals("F")){
		  float formula = (float) ((62.1*alt)-44.7);
		  
		  System.out.print("F. Seu peso ideal é: " + formula);
		  
	  }else{
	  float formula = (float) ((72.7*alt)-58);
	  
	  System.out.print("M. Seu peso ideal é: " + formula);
	  
	  }
		
	}
}
