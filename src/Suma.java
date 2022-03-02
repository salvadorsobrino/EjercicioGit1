
public class Suma {
	private static int acumulado;

	public static int sumarDosNumeros(int n1, int n2) {
		acumulado = n1+n2;
		return n1+n2; 
	}
	public static int sumaAcumulada(int n) {
		acumulado += n;
		return acumulado;
	}

}
