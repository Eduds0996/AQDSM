package aqdm.lab01;

import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(5.00));
		figuras.add(new Triangulo(4.00 , 3.00));
		figuras.add(new Quadrado(5.00));
		figuras.add(new Retangulo(4.00 , 3.00));
		figuras.add(new Losango(5.00 , 4.00));
		figuras.add(new Trapezio(4.00 , 3.00));
		figuras.add(new Cubo(4.00 , 4.00));
		figuras.add(new Esfera(3.00));
		figuras.add(new Cilindro(5.00 , 15.30));
		figuras.add(new Piramide(5.00 , 9.30));

		for(Figura f:figuras) {

			if(f.area() != 0 ) {
				System.out.print("Area = " + f.area() + "   ");
			}
			if(f instanceof Diagonal && ((Diagonal)f).diagonal() != 0) {
				System.out.print("Diagonal = " + ((Diagonal)f).diagonal() + "   ");
			}
			if(f.perimetro() != 0 ) {
				System.out.println("Perimetro = " + f.perimetro() + "   ");
			}
			if(f instanceof Volume) {
				System.out.println("Volume = " + ((Volume)f).volume() + "   ");
			}
		}
	}

}
