package model.domain;

import model.constantes.TipoChocolates;

public class Chocolate extends Golosina{
	private TipoChocolates tipoChocolate;
	
	public Chocolate() {
		// TODO Auto-generated constructor stub
	}

	public Chocolate(int codigo, String nombre, double precio, String ingredientes, TipoChocolates tipoChocolate) {
		super(codigo, nombre, precio, ingredientes);
		this.tipoChocolate=tipoChocolate;
	}
	
	

}
