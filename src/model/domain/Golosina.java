package model.domain;

public class Golosina {
	protected int codigo;
	protected String nombre;
	protected double precio;
	protected String ingredientes;
	
	public Golosina() {
		// TODO Auto-generated constructor stub
	}

	public Golosina(int codigo, String nombre, double precio, String ingredientes) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.ingredientes = ingredientes;
	}
	
	
}
