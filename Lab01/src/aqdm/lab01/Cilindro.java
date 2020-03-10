package aqdm.lab01;

public class Cilindro extends Circulo implements Volume {
	protected double comprimento;

	public Cilindro(double raio , double comprimento) {
		super(raio);
		this.comprimento = comprimento;
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
	public double volume() {
		return Math.PI * this.raio * this.raio * this.comprimento;
	}

}
