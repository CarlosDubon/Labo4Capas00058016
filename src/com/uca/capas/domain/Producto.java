package com.uca.capas.domain;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



public class Producto {
	@NotNull(message="Este campo no puede ser nulo")	
	@Size(message="Este campo no puede tener un maximo de 30 caracteres",min=0,max=30)
	private String nombre;
	@NotNull(message="Este campo no puede ser nulo")
	@Size(message="Este campo no puede tener un maximo de 30 caracteres",min=0,max=30)
	private String marca;
	@NotNull(message="Este campo no puede ser nulo")	
	@Size(message="Este campo no puede tener un maximo de 30 caracteres",min=0,max=30)
	private String descripcion;
	@NotNull(message="Este campo no puede ser nulo")
	@Size(message="Este campo no puede tener un maximo de 30 caracteres",min=0,max=30)
	private String categoria;
	@NotNull(message="Este campo no puede ser nulo")
	@Size(message="Este campo no puede tener un maximo de 30 caracteres",min=0,max=30)
	@DecimalMin(message="El precio no puede ser negativo",value = "0")
	private String precio;
	@NotNull(message="Este campo no puede ser nulo")
	@Size(message="Este campo no puede tener un maximo de 30 caracteres",min=0,max=30)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private String fechaVencimiento;
	
	
	public Producto() {
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public String getPrecio() {
		return precio;
	}


	public void setPrecio(String precio) {
		this.precio = precio;
	}


	public String getFechaVencimiento() {
		return fechaVencimiento;
	}


	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
}
