package com.sura.surasy.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	
	@Id
	private int idUser;
	
	private String nombre;
	private int telefono;
	
	@ManyToMany
	@JoinTable(name = "UserProducto", 
				joinColumns = { @JoinColumn(name = "IdUser") }, 
				inverseJoinColumns = { @JoinColumn (name = "IdProducto") })
	private Set<Producto> dataSetProducto;
	
	public User() {
		
	}
	
	public User(int idUser, String nombre, int telefono) {
		super();
		this.idUser = idUser;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	

}
