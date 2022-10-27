package com.sura.surasy.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Productos")
public class Producto {
	
	@Id
	private int idProducto;
	
	private String nombre;
	private int valoracion;
	
	@ManyToMany (mappedBy="dataSetProducto")
	@JsonIgnore
	private Set<User> dataSetUser;
	
	public Producto() {
		
	}
	
	public Producto(int idProducto, String nombre, int valoracion) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.valoracion = valoracion;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	
	

}
