package com.example.pfc_parking;

public class Lista_entrada {
	private String textoEncima; 
	private String textoDebajo; 
	private String textoDebajo2;
	
	public Lista_entrada (String textoEncima, String textoDebajo, String textoDebajo2) {  
	    this.textoEncima = textoEncima; 
	    this.textoDebajo = textoDebajo; 
	    this.textoDebajo2 = textoDebajo2;
	}

	public String get_textoEncima() { 
	    return textoEncima; 
	}

	public String get_textoDebajo() { 
	    return textoDebajo; 
	}

	public String get_textoDebajo2() {
	    return textoDebajo2; 
	} 
}

