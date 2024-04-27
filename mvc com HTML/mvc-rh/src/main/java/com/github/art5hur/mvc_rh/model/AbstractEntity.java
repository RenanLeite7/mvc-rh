package com.github.art5hur.mvc_rh.model;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity <ID> implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //AUTO para criar para cada BD o que for preciso
	private ID id;

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	
	
	
	

	
}