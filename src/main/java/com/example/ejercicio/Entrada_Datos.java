package com.example.ejercicio;
import javax.swing.*;


public class Entrada_Datos {

	public static void main(String[] args) {
	 
		String nombre_usuario = JOptionPane.showInputDialog(" Introduce tu nombre ");
		String edad= JOptionPane.showInputDialog( " Introduce Edad ");
		int edad_usuario = Integer.parseInt(edad);
		edad_usuario ++;
		
		System.out.println( "hola " + nombre_usuario + " tienes " + edad_usuario);
		System.out.println( " El año que viene  " + nombre_usuario + " y tendras " + edad_usuario);
		
	}

}
