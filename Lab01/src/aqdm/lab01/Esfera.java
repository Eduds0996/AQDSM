package aqdm.lab01;

public class Esfera extends Circulo implements Volume{
	
	public Esfera(double raio) {
		super(raio);
	}
	
	@Override
	public double volume() {
		return (Math.PI * this.raio * this.raio * this.raio)* (4.00/3.00);
	}
	
	@Override
	public double area() {
		return 0;
	}
	
	@Override
	public double perimetro() {
		return 0 ;
	}
}
