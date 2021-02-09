package com.example.ejercicio;

import javax.swing.*;

public class Peso {

	public static void main(String[] args) {

		String genero ;
		// int altura = 0;
		int pesoIdeal = 0;
int numeroAltura = 0;
		
		// si es hombre debe pesar la altura -100
		// si es mujer debe pesar la altura -110

		do {

			genero = JOptionPane.showInputDialog(" introduce tu genero  (H/M)");

		} while (genero.equalsIgnoreCase("H") == false && genero.equals("M") == false);

		int altura = Integer.parseInt(JOptionPane.showInputDialog(" introduce tu altura en cm"));
		
		
		
		if (genero.equalsIgnoreCase("H")== true) {
			pesoIdeal = altura - 100;

		} 
		else if (genero.equalsIgnoreCase("M")==true) {
			pesoIdeal = altura - 110;
		}

		System.out.println(" tu peso ideal es " + pesoIdeal);

	}
}