package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Aula64_OrientObject {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();      // Vou guardar o valor digitado no Objeto x e no Atributo a. 
		x.b = sc.nextDouble();		// Vou guardar o valor digitado no Objeto x e no Atributo b.
		x.c = sc.nextDouble();		// Vou guardar o valor digitado no Objeto x e no Atributo c.
		System.out.println("Enter the measures of triangle x: ");
		y.a = sc.nextDouble();  	// Vou guardar o valor digitado no Objeto y e no Atributo a.
		y.b = sc.nextDouble();  	// Vou guardar o valor digitado no Objeto y e no Atributo b.
		y.c = sc.nextDouble();		// Vou guardar o valor digitado no Objeto y e no Atributo c.
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f.\n", areaX);
		System.out.printf("Triangle Y area: %.4f.\n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}

}
