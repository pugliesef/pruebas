package com.example.ejercicio;
import java.util.*;
import javax.swing.*;


public class Switch {

	public static void main(String[] args) {
		// Buscar area de cuadrado . rectangulo, triangulo , circulo
		// con JOptionPane

		Scanner entrada = new Scanner (System.in);
		
		System.out.println(" Elija la figura");
		System.out.println("1 Cuadrado");
		System.out.println("2 Rectangulo ");
		System.out.println("3 Triangulo ");
		System.out.println("4 Circulo " );
		
		int figura = entrada.nextInt();
		
		switch (figura) {
		
		
		case 1: int lado = Integer.parseInt(JOptionPane.showInputDialog( "Introduzca el lado"));
		System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
		
		break;
		
		case 2:  int base = Integer.parseInt(JOptionPane.showInputDialog( "Introduzca la base"));
				 int altura = Integer.parseInt(JOptionPane.showInputDialog(" Introduzca la altura"));
		
		System.out.println("El area del rectangulo  es " + base*altura);
		break;
		
		case 3:  int base1 = Integer.parseInt(JOptionPane.showInputDialog( "Introduzca la base"));
		 		 int altura1 = Integer.parseInt(JOptionPane.showInputDialog(" Introduzca la altura"));
		 		System.out.println("El area del Triangulo es " + (base1*altura1)/2);
		 		break;
		 		
		case 4: int radio = Integer.parseInt(JOptionPane.showInputDialog( "Introduzca el radio"));
		
				System.out.print("El area del Circulo es " );
				System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
				
				break;
		
				default :
					System.out.print(" El numero ingresado no esta en la lista " );
		
		 		 
		}
		
	}

}
