package view;

import java.util.Scanner;

public class Util {

//Metodo para escribir (sin salto de linea)
	public static void escribir(String mensaje) {
		System.out.print(mensaje);
		}
		
//Metodo para escribir (con salto linea)
	public static void escribirLn(String mensaje) {
		System.out.println(mensaje);
		}

// Metodo para leer un int
	public static int leerInt(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		int respuesta;
		System.out.print(pregunta);
		respuesta = Integer.parseInt(teclado.nextLine());
		return respuesta;
		}
		
// Metodo para leer un double
	public static double leerDouble(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		double respuesta;
		System.out.print(pregunta);
		respuesta = Double.parseDouble(teclado.nextLine());
		return respuesta;
		}
		
//Metodo para leer un String
	public static String leerString(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		System.out.print(pregunta);
		respuesta = teclado.nextLine();
		return respuesta;
		}

//Metodo para leer un Char
	public static char leerChar(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		char respuesta;
		System.out.print(pregunta);
		respuesta = teclado.nextLine().charAt(0);
		return respuesta;
		}
		
// Método para subrayar
	public static void subrayar (String texto, String caracter) {
		System.out.println(texto);
		for (int i = 1; i <= texto.length(); i++) {
			System.out.print(caracter);
		}
		System.out.println();
	}
	
// Método crear números aleatorios
	public static int aleatorio(int n1) {
		int aleatorio = (int)(Math.random()*n1 + 1);
		return aleatorio;
	}
	
}
