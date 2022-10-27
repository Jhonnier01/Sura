package com.sura.surasy.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

public class UserProductoId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "idUser")
	private Long idUser;
	
	@Column(name = "idProducto")
	private Long idProducto;
	
	public UserProductoId() {
		super();
	}

	public UserProductoId(Long idUser, Long idProducto) {
		super();
		this.idUser = idUser;
		this.idProducto = idProducto;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	/*
	@Override   
    public int hashCode() {
        return Objects.hash(idUser, idProducto);
    }
	
	 @Override
	    public String toString() {
	        return "ProfesormoduloId [idUser=" + idUser + ", idProducto=" + idProducto + "]";
	    }
*/
}
