package view;

import java.util.Scanner;

/**
 * <h2>Clase Util, métodos básicos para mostrar por pantalla o leer datos por la consola</h2>
 * @author maria
 * @since 06-03-2022
 */
public class Util {

/**
 * Escribir por pantalla
 * @param mensaje <i>Texto introducido</i>
 */
	public static void escribir(String mensaje) {
		System.out.print(mensaje);
		}
		
	/**
	 * Escribir por pantalla con salto de linea
	 * @param mensaje <i>Texto introducido</i>
	 */
	public static void escribirLn(String mensaje) {
		System.out.println(mensaje);
		}

	/**
	 * Leer un int transfromando el texto introducido por el usuario en tipo int
	 * @param pregunta <i>Pregunta a realizar al usuario</i>
	 * @return respuesta del usuario
	 */
	public static int leerInt(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		int respuesta;
		System.out.print(pregunta);
		respuesta = Integer.parseInt(teclado.nextLine());
		return respuesta;
		}
		
	/**
	 * Leer un double transfromando el texto introducido por el usuario en tipo double
	 * @param pregunta <i>Pregunta a realizar al usuario</i>
	 * @return respuesta del usuario
	 */
	public static double leerDouble(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		double respuesta;
		System.out.print(pregunta);
		respuesta = Double.parseDouble(teclado.nextLine());
		return respuesta;
		}
		
	/**
	 * Leer un string transfromando el texto introducido por el usuario en tipo string
	 * @param pregunta <i>Pregunta a realizar al usuario</i>
	 * @return respuesta del usuario
	 */
	public static String leerString(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		System.out.print(pregunta);
		respuesta = teclado.nextLine();
		return respuesta;
		}

	/**
	 * Leer un char transfromando el texto introducido por el usuario en tipo char
	 * @param pregunta <i>Pregunta a realizar al usuario</i>
	 * @return respuesta del usuario
	 */
	public static char leerChar(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		char respuesta;
		System.out.print(pregunta);
		respuesta = teclado.nextLine().charAt(0);
		return respuesta;
		}
		
	/**
	 * Subrayar un texto al mostrarlo por pantalla
	 * @param texto <i>Texto a subrayar</i>
	 * @param caracter <i>Carácter con el cual se subrayará el texto</i>
	 */
	public static void subrayar (String texto, String caracter) {
		System.out.println(texto);
		for (int i = 1; i <= texto.length(); i++) {
			System.out.print(caracter);
		}
		System.out.println();
	}
	
	/**
	 * Generar un número aleatorio hasta un número tope
	 * @param n1 <i>Numero tope para generar aleatorio</i>
	 * @return número aleatorio
	 */
	public static int aleatorio(int n1) {
		int aleatorio = (int)(Math.random()*n1 + 1);
		return aleatorio;
	}
	
}
