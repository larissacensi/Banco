/**
 *
 * @author Larissa Censi
 */

import java.util.HashSet;

import java.util.Iterator;

import java.util.Scanner;

import java.util.Set;



public class TelaTriangulo {


	public static void main(String args[]) {
            Triangulo triangulo = new Triangulo();
            
		Scanner sc = new Scanner(System.in);

		System.out.println("Informa o tipo do triangulo");

		System.out.println("Informa o valor do lado a");

		double a = sc.nextDouble();

		System.out.println("Informa o valor do lado b");

		double b = sc.nextDouble();

		System.out.println("Informa o valor do lado c");

		double c = sc.nextDouble();
		
		System.out.println("Propriedades do triangulo ->");

                Set<String> propriedades = triangulo.verificar(a, b, c);
                
		for (String valor : propriedades) {

			System.out.println(valor);

		}

	}             

}