package main;

public class Cumprimentos {

	public void verTurno(String s){
		String ss = s.toUpperCase();
		if(ss.equals("M")){
			System.out.println("BOM DIA!!");
		}else if(ss.equals("V")){
			System.out.println("BOA TARDE!!");
		}else if(ss.equals("N")){
			System.out.println("BOA NOITE!!");
		}else{
			System.out.println("VALOR INVÁLIDO");
		}
	}
}
