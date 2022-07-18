package n3ex1;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		String producto = "libro";
		double precioEuros = 10;
		
		CambioDivisa cdDolar = new ADolares();
		CambioDivisa cdYen = new AYenes();
		CambioDivisa cdRublo = new ARublos();
		CambioDivisa[] mcd = { cdDolar, cdYen, cdRublo };	
		
		Divisa[] mdiv = Divisa.values();

		muestraPrecioArticulo( mdiv, mcd, producto, precioEuros );
		
		System.out.println ( "--------------------");
		ArrayList<Producto> productos = new ArrayList<>();
		Producto libro = new Producto("Libro", 10.0);
		Producto boli = new Producto("Boligrafo", 1.45);
		Producto carpeta = new Producto("Carpeta", 2.15);
		productos.add(libro);
		productos.add(boli);
		productos.add(carpeta);
		
		muestraPrecioListaArticulos( mdiv, mcd, productos );
	}
	
	public static void muestraPrecioArticulo(Divisa[] mdiv, CambioDivisa[] mcd, String producto, double precioEuros) {
		MuestraPrecios mp;
		for ( int i=0; i < mdiv.length; i++ ) {
			mp = new MuestraPrecios(producto, precioEuros, mcd[i], mdiv[i]);
			mp.mostrarPrecios();
		}
	}
	
	public static void muestraPrecioListaArticulos(Divisa[] mdiv, CambioDivisa[] mcd, ArrayList<Producto> productos) {
		for ( int i=0; i < productos.size(); i++ ) {
			muestraPrecioArticulo( mdiv, mcd, productos.get(i).getNombre(), productos.get(i).getPrecio() );
		}
	}

}
