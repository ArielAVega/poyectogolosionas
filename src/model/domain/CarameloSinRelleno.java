package model.domain;

public class CarameloSinRelleno extends Golosina{
	private String color;
	private String sabor;
	
	public CarameloSinRelleno() {
		// TODO Auto-generated constructor stub
	}

	public CarameloSinRelleno(int codigo, String nombre, double precio, String ingredientes, String color, String sabor) {
		super(codigo, nombre, precio, ingredientes);
		this.color = color;
		this.sabor = sabor;
	}
	
	
}
