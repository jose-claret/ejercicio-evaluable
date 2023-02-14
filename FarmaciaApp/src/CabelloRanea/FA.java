package CabelloRanea;

import java.util.Scanner;

public class FA {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int edad;
		float peso, altura;
		System.out.print("Bienvenido a FarmaciaApp, descubre su riesgo al consumir alcohol. "
				+ "Introduce su peso [kg], su altura [m] y su edad: ");
		
		peso = teclado.nextFloat();
		altura = teclado.nextFloat();
		edad = teclado.nextInt();
		float imc = peso / (altura * altura);
		System.out.println("Su imc es " + imc);
		
		if (edad < 18)
			System.out.println("Legalmente no le está permitido la ingesta de alcohol");
		
		else if (edad >= 18){
			if (imc < 18.5)
				System.out.println("No se le recomienda el consumo de alcohol por riesgo de intoxicación");
			else if (edad < 70 && imc <= 24.9)
				System.out.println("Recuerde beber con moderación");
			else
				System.out.println("Usted sabrá lo que hace");
		}
		teclado.close();
	}
}

