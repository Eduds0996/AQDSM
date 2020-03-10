package aqdm.lab01;

public abstract class Poligono extends Figura {

	protected  double altura;
	protected  double base;
	
	public Poligono(double altura , double base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}

}
