import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer n�mero: ");
		int n1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		int n2 = sc.nextInt();
		System.out.println("La suma resultante es: " + Suma.sumarDosNumeros(n1, n2));
		System.out.println("Introduce otro n�mero: ");
		int n = sc.nextInt();
		System.out.println("La suma acumulada es: " + Suma.sumaAcumulada(n));

	}

}
