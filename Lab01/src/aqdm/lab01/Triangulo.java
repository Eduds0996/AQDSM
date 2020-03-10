package aqdm.lab01;

public class Triangulo extends Poligono {

	public Triangulo(double altura, double base) {
		super(base, altura);
	}
	
	@Override
	public double area() {
		return (this.base * this.altura)/2.00 ;
	}
	
	@Override
	public double perimetro() {
		return this.altura + this.base + Math.sqrt((Math.pow(this.altura , 2)+ Math.pow(this.base , 2)));
	}

}
