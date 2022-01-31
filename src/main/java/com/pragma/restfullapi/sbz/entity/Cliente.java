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
@Table(name="clientes") 
@Value @Getter @Setter
public class Cliente {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id")
	private int id;
	
	@Column(name = "nombre", nullable = false, length = 15) 						
	private String nombre;
	
	@Column(name = "apellidos", nullable = false, length = 30 )					
	private String apellidos;
	
	@Column(name = "edad", nullable = false ) 						
	private int edad;
	
	@Column(name = "tipoIdentificacion", nullable = false, length = 15 ) 		
	private String tipoIdentificacion;
	
	@Column(name = "identificacion", nullable = false, length = 10 ) 			
	private int identificacion;
	
	@Column(name = "ciudadNacimineto", nullable = false, length = 30 ) 			
	private String ciudadNacimineto;
	
	
	
}
