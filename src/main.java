import java.util.Scanner;

/**
 * @author salvador.sobrino
 *
 */
public class main {

	/** Con Shift-Alt-J se a�ade javadoc
	 * @param args
	 */
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
		
		System.out.println("Introduce el primer n�mero: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		int num2 = sc.nextInt();
		System.out.println("La resta resultante es: " + Resta.restarDosNumeros(num1, num2));
		System.out.println("Introduce otro n�mero: ");
		int num = sc.nextInt();
		System.out.println("La resta acumulada es: " + Resta.restaAcumulada(num));
		

		System.out.println("Linea que genera conflicto");
		System.out.println("A�adimos esta linea desde el REMOTO");
		System.out.println("Fin del programa");

	}

}
