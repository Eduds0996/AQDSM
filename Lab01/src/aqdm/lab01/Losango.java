package aqdm.lab01;

public class Losango extends Poligono {

	public Losango(double altura , double base) {
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

}
