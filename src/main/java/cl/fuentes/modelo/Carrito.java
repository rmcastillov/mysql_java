package cl.fuentes.modelo;

public class Carrito {

	private int codproducto;
	private String producto;
	private int precio;
	
	public Carrito() {

	}
	public Carrito(int codproducto, String producto, int precio) {
		super();
		this.codproducto = codproducto;
		this.producto = producto;
		this.precio = precio;
	}
	public int getCodproducto() {
		return codproducto;
	}
	public void setCodproducto(int codproducto) {
		this.codproducto = codproducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

	
	
}
