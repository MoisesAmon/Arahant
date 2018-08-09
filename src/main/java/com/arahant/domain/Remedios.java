package com.arahant.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Remedios implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nomeremedio;
	
	public Remedios() {	
		
	}
	
	
	public Remedios(int id, String nomeremedio) {
		super();
		this.id = id;
		this.nomeremedio = nomeremedio;
	}


	public int getId() {
		return id;
		
	}

	public void setId(int id) {
		this.id = id;
		
	}
	
	public String getNomeremedio() {
		return nomeremedio;
	}

	public void setNomeremedio(String nomeremedio) {
		this.nomeremedio = nomeremedio;
	}
	
	
	

}
