package main;

public class Quadrado {
	double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	public double areaQuadrado(double lado){
		setLado(lado);
		double area = lado*lado;
		return area;
		
	}
	
	public double dobroAreaQuadrado(){
		return areaQuadrado(getLado()) * 2;
	}
	
}
