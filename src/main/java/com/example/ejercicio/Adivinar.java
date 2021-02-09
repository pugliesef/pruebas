package com.example.ejercicio;

import java.util.Scanner;

public class Adivinar {

	public static void main(String[] args) {

		int aleatorio = (int) (Math.random() * 100); // castearlo con el int sino es double

		Scanner entrada = new Scanner(System.in);

		int numero = 0;

		int intentos = 0;

		while (numero != aleatorio) {
			intentos++; // agrego cantidad de intentos

			System.out.println(" ingrese un numero");
			numero = entrada.nextInt(); // ingreso numero por teclado

			
			
			
			if (aleatorio < numero) {
				System.out.println(" El numero aleatorio es Menor ");

			} 
		
			else if (aleatorio > numero) {
				System.out.println(" El numero aleatorio es es Mayor ");
			
			} else if (aleatorio == numero) {
				
				System.out.println(" Lo lograste !!!  ");
			}

		}

	}

}
