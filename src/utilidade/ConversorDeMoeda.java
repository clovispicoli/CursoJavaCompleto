package utilidade;

public class ConversorDeMoeda {

	public static double IOF = 0.06;
	
	public static double dolarParaReal(double montante, double precoDolar) {
		return montante * precoDolar * (1.0 + IOF);
	}

}
