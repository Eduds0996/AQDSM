package aqdm.lab01;

public class Cubo extends Quadrado implements Volume {
	private double largura;
	
	public Cubo(double base , double largura) {
		super(base);
		this.largura = largura;
	}
	
	@Override
	public double volume() {
		return this.base * this.base * this.largura; 
	}
	
	@Override
	public double area() {
		return 0;
	}
	
	@Override
	public double perimetro() {
		return 0 ;
	}
	
	@Override
	public double diagonal() {
		return 0;
	}
}
