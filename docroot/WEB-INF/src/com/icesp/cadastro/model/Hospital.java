package com.icesp.cadastro.model;

import java.io.Serializable;

public class Hospital implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String id;
	String nome;
	
	public Hospital() {
		super();
	}
	
	public Hospital(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
