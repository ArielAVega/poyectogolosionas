package model.domain;

public class CarameloConRelleno extends Golosina{
	private String saborRelleno;
	private double cantidadRelleno;
	
	public CarameloConRelleno() {
		// TODO Auto-generated constructor stub
	}

	public CarameloConRelleno(int codigo, String nombre, double precio, String ingredientes, String saborRelleno, double cantidadRelleno) {
		super(codigo, nombre, precio, ingredientes);
		this.saborRelleno=saborRelleno;
		this.cantidadRelleno = cantidadRelleno;
	}
	
	
	
	

}
