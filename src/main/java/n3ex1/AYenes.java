package n3ex1;

public class AYenes implements CambioDivisa {
	
	private final double CONV = 137.645;

	@Override
	public double cambio(double cantidad) {
		double res = CONV * cantidad;
		return res;
	}

}
