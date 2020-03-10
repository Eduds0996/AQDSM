package aqdm.lab01;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double base) {
		super(base , base);
	}
	
	@Override
	public double area() {
		return this.base * this.base;
	}
	
	@Override
	public double perimetro() {
		return ((this.base * 2.00) + (this.base * 2.00));
	}
	
	@Override
	public double diagonal() {
		return Math.sqrt((Math.pow(this.base , 2.00)+ Math.pow(this.base , 2.00)));
	}

}
