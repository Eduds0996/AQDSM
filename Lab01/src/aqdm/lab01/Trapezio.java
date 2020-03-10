package aqdm.lab01;

public class Trapezio extends Poligono {
	private double lado;
	private double basemaior;
	public Trapezio(double altura , double base) {
		super(altura , base);
	}
	
	@Override
	public double area() {
		this.lado = Math.sqrt((Math.pow(this.altura , 2)+ Math.pow(this.base , 2)));
		this.basemaior = (Math.sqrt((Math.pow(this.lado , 2) - Math.pow(this.altura , 2))))*2 + this.base;
		return ((this.basemaior + this.base)* this.altura)/2;
	}

	@Override
	public double perimetro() {
		return this.basemaior + this.base + (this.lado)*2.00 ;
	}
}
