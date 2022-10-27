package com.sura.surasy.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserProducto", schema = "public")
@IdClass(UserProductoId.class)
public class UserProducto {
	
	@Id
	private Long idUser;
	
	@Id
	private Long idProducto;
	
	private int valoracion;
	
	@ManyToOne
    @JoinColumn(name = "idUser", referencedColumnName = "idUser", insertable = false, updatable = false)
    private User user;
	
	 @ManyToOne
	 @JoinColumn(name = "idProducto", referencedColumnName = "idProducto", insertable = false, updatable = false)
	 private Producto producto;

	public UserProducto() {
		
	}

	public UserProducto(Long idUser, Long idProducto, int valoracion) {
		super();
		this.idUser = idUser;
		this.idProducto = idProducto;
		this.valoracion = valoracion;
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

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	/*
	@Override
    public int hashCode() {
        return Objects.hash(user, producto);
    }
	*/
}
