package com.pragma.restfullapi.sbz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Entity 
@Table(name="imagenes") 
@Value @Getter @Setter
public class Imagen {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
	private int id;
	@Column(name = "foto", nullable = false, length = 15)
	private String foto;
		
}