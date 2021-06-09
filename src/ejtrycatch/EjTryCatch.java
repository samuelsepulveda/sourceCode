/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejtrycatch;

import java.util.*;

/**
 * @author ssc
 * Ejemplo para mostrar ejemplo de try-catch y formateo de salida
 * 
 */

public class EjTryCatch {

//commentary

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		boolean ciclo = true; // controla la ejecución del ciclo para volver a ingresar valores en caso de error
		int num1, num2;
		double resul = 0.0;
		
		do {
			try {
				System.out.println("Numero 1:");
				num1 = scn.nextInt();
				System.out.println("Numero 2:");
				num2 = scn.nextInt();
				
				// para evitar problemas de tipos de datos int y double 
				// uso del operador ternario ? en lugar de if-else
				resul = (num2!=0) ? (double) num1/num2 : num1/num2;
				
				//uso de printf para salida con formato de 3 decimales
				System.out.printf("El resultado de %d / %d es: %.3f%n",num1, num2, resul); 
			    ciclo = false;
			}
			// validar que se ingresen solo numeros
			catch (InputMismatchException exc) {
				System.err.printf("\n Excepcion: %s\n", exc);
				scn.nextLine();
				System.out.println("Debe introducir solo numeros. \n Intente nuevamente\n");
			}
			// validar que el n2 no sea CERO
			catch (ArithmeticException exc) {
				System.err.printf("\n Excepcion: %s\n", exc);
				System.out.println("Cero es un denominador NO valido. \n Intente nuevamente\n");
			}
			
		} while (ciclo);
		
		scn.close(); // cerrar la variable de tipo Scanner
		
		
	}
		

}