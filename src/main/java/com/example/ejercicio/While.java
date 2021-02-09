package com.example.ejercicio;

import javax.swing.*;

public class While {
//Acceso a aplicacion con contraseña. mientras el usuario no ponga la contraseña
	public static void main(String[] args) {

		String clave = "Opendev";
		String pass = "";
		int intentos= 0;
		
		
		while (clave.equals(pass) == false) {
			
			intentos ++;
			pass = JOptionPane.showInputDialog(" Introduce la contraseña");
			boolean clave1 = (clave.equals(pass) == false);

			// System.out.println((clave1) ? " Contrasña Incorrecta " : " Felicidades sos
			// todo un traine capo ");

			if (clave.equals(pass) == false) {
				System.out.println("Contraseña Incorrecta");

			} // bucle infinito porque si la pw es incorrecta vuelve a entrar en el while
		}

		System.out.println(" Contraseña Correcta " + " al fin, hiciste " + intentos + " Intentos ");

	}

}
