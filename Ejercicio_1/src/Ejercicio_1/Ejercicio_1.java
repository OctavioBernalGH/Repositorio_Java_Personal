package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		/* Definici�n clase Scanner */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n- Introduce un n�mero: ");
		int dato1 = scanner.nextInt();
		
		System.out.print("- Introduce otro n�mero: ");
		int dato2 = scanner.nextInt();
		
		System.out.println("\n La suma de " + dato1 + " y " + dato2 + " es: " + (sumar(dato1, dato2)));
		System.out.println("\n La resta de " + dato1 + " y " + dato2 + " es: " + (restar(dato1, dato2)));
		System.out.println("\n La multiplicaci�n de " + dato1 + " y " + dato2 + " es: " + (multiplicar(dato1, dato2)));
		System.out.println("\n La divisi�n de " + dato1 + " y " + dato2 + " es: " + (dividir(dato1, dato2)));

	}

	static int sumar(int num1, int num2) {
		return (num1 + num2);
	}

	static int restar(int num1, int num2) {
		return (num1 - num2);
	}

	static int multiplicar(int num1, int num2) {
		return (num1 * num2);
	}

	static int dividir(int num1, int num2) {
		return (num1 / num2);
	}

}
