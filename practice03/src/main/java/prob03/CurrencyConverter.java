package prob03;

public class CurrencyConverter {
	private static double rate;
	
	public static double toDollar(double won) {
		double dollar = won/rate;
		return dollar;
	}

	public static double toKRW(double dollar) {
		double krw = dollar*rate;
		return krw;
	}

	public static void setRate(double r) {
		rate = r;
	}
}
