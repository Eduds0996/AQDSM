package aqdm.lab01;

public class Circulo extends Figura {

protected double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		return this.raio * this.raio * Math.PI ;
	}
	
	@Override
	public double perimetro() {
		return this.raio * 2.00 * Math.PI ;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
