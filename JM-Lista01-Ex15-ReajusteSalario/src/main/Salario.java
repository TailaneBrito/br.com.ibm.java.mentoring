package main;

public class Salario {

	public double reajusteSalario(double salario){
		double ss = salario;
		double per = 0;
		
		if(salario <= 280){
			per = 20;
			salario += salario * 0.20;
		}else if(salario <= 700){
			per = 15;
			salario += salario * 0.15;
		}else if(salario <= 1500){
			per = 10;
			salario += salario * 0.10;
		}else{
			per = 5;
			salario += salario * 0.05;
		}
		
		System.out.println("Salario Antes...: " + ss);
		System.out.println("Percentual......: " + per + "%");
		System.out.println("Valor aumentado.: " + (salario - ss));
		System.out.println("Salario depois..: " + salario);
		
		return salario;
	}
}
