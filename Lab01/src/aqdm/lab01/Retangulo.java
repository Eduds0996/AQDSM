package aqdm.lab01;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double altura , double base) {
		super(altura , base);
	}

	@Override
	public double area() {
		return this.altura * this.base;
	}

	@Override
	public double perimetro() {
		return ((this.altura * 2.00) + (this.base * 2.00));
	}
	
	@Override
	public double diagonal() {
		return Math.sqrt((Math.pow(this.altura , 2)+ Math.pow(this.base , 2)));
	}
}
