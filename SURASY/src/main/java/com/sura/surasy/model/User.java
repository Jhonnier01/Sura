package com.sura.surasy.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="User", schema = "public")
public class User {
	
	@Id
	private int idUser;
	
	private String nombre;
	private String telefono;
	private boolean citar;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	private List<UserProducto> userProducto = new ArrayList<>();
	
	public User() {
		
	}
	

	public User(int idUser, String nombre, String telefono, boolean citar, List<UserProducto> userProducto) {
		super();
		this.idUser = idUser;
		this.nombre = nombre;
		this.telefono = telefono;
		this.citar = citar;
		this.userProducto = userProducto;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean isCitar() {
		return citar;
	}

	public void setCitar(boolean citar) {
		this.citar = citar;
	}

	public List<UserProducto> getUserProducto() {
		return userProducto;
	}

	public void setUserProducto(List<UserProducto> userProducto) {
		this.userProducto = userProducto;
	}
	
	

}
