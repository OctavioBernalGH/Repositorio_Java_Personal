package Ejercicio_2;

public class Ejercicio_2 {

	public static void main(String[] args) {

		/* Definición de array de una dimensión con valores */
		int[] numeros = { 5, 10, 15, 20, 25, 30 };
		String [] nombres = {"Paco" , "Manuel", "Mariana" , "Eva", "Josefa", "Victor"};
		
		/* Array con tamaño definido  y asignación manual según posición*/
		double [] numerosD = new double[4];
		numerosD[0] = 1.05;
		numerosD[1] = 2.15;
		numerosD[2] = 3.55;
		numerosD[3] = 5.85;
		
		/* Llamada a funciones*/
		recorrerArreglo(numeros);
		System.out.println("\n");
		recorrerArreglo(nombres);
		System.out.println("\n");
		recorrerArreglo(numerosD);

	}

	/* Función del tipo void que recorre un arreglo y nos devuelve la posición y el valor*/
	static void recorrerArreglo(int[] numeros) {
		for(int i=0; i < numeros.length; i++) {
			System.out.println("Posición: " + i + " valor: " + numeros[i]);
		}
	}
	
	/* Sobrecarga de funciones , pero con diferente tipo de dato "String"*/
	static void recorrerArreglo(String[] nombres) {
		for(int i=0; i < nombres.length; i++) {
			System.out.println("Posición: " + i + " nombre: " + nombres[i]);
		}
	}
	
	/* Sobrecarga de funciones con diferente dato "double" */
	static void recorrerArreglo(double[] numerosD) {
		for(int i=0; i < numerosD.length; i++) {
			System.out.println("Posición: " + i + " nombre: " + numerosD[i]);
		}
	}
}
