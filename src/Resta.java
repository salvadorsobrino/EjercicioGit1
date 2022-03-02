
public class Resta {
	private static int acumulado;

	public static int restarDosNumeros(int n1, int n2) {
		acumulado = n1-n2;
		return n1-n2; 
	}
	public static int restaAcumulada(int n) {
		acumulado -= n;
		return acumulado;
	}
}
