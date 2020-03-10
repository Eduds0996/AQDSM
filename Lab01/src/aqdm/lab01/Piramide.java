package aqdm.lab01;

public class Piramide extends Quadrado implements Volume {
	private double height;

	public Piramide(double base , double height) {
		super(base);
		this.height = height;
	}

	@Override
	public double volume() {
		return (this.base * this.base * this.height) * (1.00/3.00); 
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
