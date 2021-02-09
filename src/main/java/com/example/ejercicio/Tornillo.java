package com.example.ejercicio;

public class Tornillo implements Atornillable {

	private int LONGITUD;
	private int CANTIDAD_DE_ROSCA;
	private String TIPO_CABEZA;
	
	private int posicionActual =0; //declaramos e inicializamos en 0;
	
	
	
	
	public Tornillo(int lONGITUD, int cANTIDAD_DE_ROSCA, String tIPO_CABEZA) {
		
		LONGITUD = lONGITUD;
		CANTIDAD_DE_ROSCA = cANTIDAD_DE_ROSCA;
		TIPO_CABEZA = tIPO_CABEZA;
		
		
	}


	public int getLONGITUD() {
		return LONGITUD;
	}


	public void setLONGITUD(int lONGITUD) {
		LONGITUD = lONGITUD;
	}


	public int getCANTIDAD_DE_ROSCA() {
		return CANTIDAD_DE_ROSCA;
	}


	public void setCANTIDAD_DE_ROSCA(int cANTIDAD_DE_ROSCA) {
		CANTIDAD_DE_ROSCA = cANTIDAD_DE_ROSCA;
	}


	public String getTIPO_CABEZA() {
		return TIPO_CABEZA;
	}


	public void setTIPO_CABEZA(String tIPO_CABEZA) {
		TIPO_CABEZA = tIPO_CABEZA;
	}


	public int getPosicionActual() {
		return posicionActual;
	}


	public void setPosicionActual(int posicionActual) {
		this.posicionActual = posicionActual;
	}
	
	
	//Implementar METODO GIRAR Tengan en cuenta que sentido "H" ajusta (++)   ,  Sentido "a" Desajusta (--)
	
	@Override
	public boolean girar (char sentido) {
		if (sentido == 'h') {              //si el sentido es igual H, posicion actual ++ osea se atornilla. sino -- desatornilla
			this.posicionActual++;
			return true;
		}else if(sentido == 'A') {
			this.posicionActual --;
			return true;
			
		}else {
			System.out.println( "No se puede girar");
		}
		return false;
		
		
	}


	
	}
	
	
	
	
	
	
	
	
	
	
	

