package com.example.ejercicio;

import java.util.ArrayList.*;
import java.util.Scanner;

public class Evalua_edad {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(" Introduce tu edad ");

		int edad = entrada.nextInt();
		
		boolean edad2 = edad >1 && edad <18 ;
		boolean edad3 = edad >= 18 && edad < 40 ;
		
		boolean edad4 =edad >= 40 && edad < 60 ;
		boolean edad5 =edad >= 60 ;
		
		
		System.out.println((edad2)  ? " es mayor de edad " : " no es mayor de edad");
		
		System.out.println((edad3)  ? " Es un trainee " : "  no se que poner porque tambien seria la condicion falsa de edad2");
		
		System.out.println((edad4)  ? " Sos joven todavia aprovecha  " : " no es mayor de edad");
		
		System.out.println((edad5)  ? " Cuidatee del coviddd !  " : " no es mayor de edad");
		
		
		
		
		
		
		
		
		
		
		
		//if (edad >= 18) {
			//System.out.println(" Es mayor de edad ");

		//} else {
			//System.out.println(" No es mayor de edad ");
		//}

//		if (edad < 18 ) {
//			
//			System.out.println(" Eres un Adolecente ");
//			}
//		
//		else if (edad < 40) {
//			
//			System.out.println(" Eres Joven ");
//		}
//		else if ( edad < 65 ) {
//			
//			System.out.println(" Eres Maduro");
//		}
//		else {
//			System.out.println(" Cuidateeee !!!  ");
//		}
		
		
	}

}
