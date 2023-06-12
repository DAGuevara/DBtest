package com.bootcamp.dbtest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

	private long id;
	private String nombre;
	private String telefono;
	private String direccion;
	private String correo;
	
}
