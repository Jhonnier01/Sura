package com.sura.surasy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Producto", schema = "public")
public class Producto {
	
	@Id
	private int idProducto;
	
	private String nombre;
	
	
	@OneToMany(mappedBy= "producto")
	private List<UserProducto> userProducto = new ArrayList<>();
	
	public Producto() {
		
	}
	

	public Producto(int idProducto, String nombre, List<UserProducto> userProducto) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.userProducto = userProducto;
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

	public List<UserProducto> getUserProducto() {
		return userProducto;
	}

	public void setUserProducto(List<UserProducto> userProducto) {
		this.userProducto = userProducto;
	}
	
	

}
