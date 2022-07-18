package n3ex1;

public class MuestraPrecios {

	private String prod;
	private double precio;
	private CambioDivisa cd;
	private Divisa div;
	
	public MuestraPrecios( String prod, double precio, CambioDivisa cd, Divisa div) {
		this.prod = prod;
		this.precio = precio;
		this.cd = cd;
		this.div = div;
	}
	
	public void mostrarPrecios() {
		System.out.println ( "Producto: " + prod + ". Precio en " + div + ": " + Math.round( cd.cambio(precio) * 100)/100.0 );
	}
	

}
