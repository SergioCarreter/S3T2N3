package n3ex1;

public class ARublos implements CambioDivisa {

	private final double CONV = 59.87;

	@Override
	public double cambio(double cantidad) {
		double res = cantidad * CONV;
		return res;
	}
}
