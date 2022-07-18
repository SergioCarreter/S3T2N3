package n3ex1;

public class ADolares implements CambioDivisa {
	
	private final double CONV = 1.05;

	@Override
	public double cambio(double cantidad) {
		double res = cantidad * CONV;
		return res;
	}

}
