package com.betocosta.cursomc.domain;

import java.io.Serializable;

public class Categoria implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nomme;
	
	public Categoria() {		
	}

	public Categoria(Integer id, String nomme) {
		this.id = id;
		this.nomme = nomme;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomme() {
		return nomme;
	}

	public void setNomme(String nomme) {
		this.nomme = nomme;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomme == null) ? 0 : nomme.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (nomme == null) {
			if (other.nomme != null)
				return false;
		} else if (!nomme.equals(other.nomme))
			return false;
		return true;
	}
	
	
	
	

}
