package com.example.ejercicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Destornillador extends Herramienta {

	String tipoDeCabeza;

	// getters y setters de Destornillador
	public Destornillador(String tipoDeCabeza) {

		this.tipoDeCabeza = tipoDeCabeza;
	}

	public String getTipoDeCabeza() {
		return tipoDeCabeza;
	}

	public void setTipoDeCabeza(String tipoDeCabeza) {
		this.tipoDeCabeza = tipoDeCabeza;
	}

	
	
	
	
	
	public static void main(String[] args) {

		Tarugo tarugo = new Tarugo(5);
		Tornillo tornillo = new Tornillo(5, 10, "Cruz");
		Destornillador destornillador = new Destornillador("Cruz");

		tornillo.girar('h');

		String respo = destornillador.atornillar(tornillo, tarugo);

		System.out.print(respo);
	
	
	
		Map<Integer, String> MapTornillos = new HashMap<Integer, String>();
		
		MapTornillos.put(1,tornillo.getTIPO_CABEZA());
		MapTornillos.put(2,tornillo.getTIPO_CABEZA());
		MapTornillos.put(3,tornillo.getTIPO_CABEZA());
		MapTornillos.put(4,tornillo.getTIPO_CABEZA());
		MapTornillos.put(5,tornillo.getTIPO_CABEZA());
		
		Iterator it = MapTornillos.keySet().iterator();
		while(it.hasNext()){
		  Integer key = (Integer) it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + MapTornillos.get(key));
		}
		  
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private String atornillar(Tornillo tornillo, Tarugo tarugo) {
		if (tornillo.getLONGITUD() == tarugo.getLONGITUD()) {
			if (tornillo.getTIPO_CABEZA() == this.tipoDeCabeza) {
				tornillo.girar('h');

				System.out.println("atornillar");
				return "El tornillo se giro una vez";
			} else {

			}

		}
		return " La puntas no coinciden ";

	}

}