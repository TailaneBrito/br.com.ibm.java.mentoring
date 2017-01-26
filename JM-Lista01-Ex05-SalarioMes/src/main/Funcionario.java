package main;

public class Funcionario {
	double horasMes;
	double valorHora;
	
	
	public double getHorasMes() {
		return horasMes;
	}


	public void setHorasMes(double horasMes) {
		this.horasMes = horasMes;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double salario(double horas, double valor){
		this.setHorasMes(horas);
		this.setValorHora(valor);
		
		double sal = this.getHorasMes() * this.getValorHora();
		
		return sal;
				
	}
}
