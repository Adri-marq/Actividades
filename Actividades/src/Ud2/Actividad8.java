package Ud2;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Pedimos los coeficientes
		double coeA, coeB, coeC, dentroraiz, raiz, solucion1, solucion2;
		System.out.println("Queremos hacer una ecuacion de 2º grado indicame los datos: ");
		System.out.println("Escribe aqui A");
		 coeA = sc.nextDouble();
		System.out.println("Escribe aqui B");
		 coeB = sc.nextDouble();
		System.out.println("Escribe aqui C");
		 coeC = sc.nextDouble();
		 //creaqmos la raiz de segundo grado
		 dentroraiz = ((coeB * coeB) - 4 * coeA * coeC);
		 raiz = Math.sqrt(dentroraiz);
		 solucion1 = coeB + raiz / 2*coeA;
		 solucion2 = coeB - raiz / 2*coeA;
	if (dentroraiz < 0) {}
	}
}