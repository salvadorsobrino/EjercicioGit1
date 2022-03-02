import java.util.Scanner;

/**
 * @author salvador.sobrino
 *
 */
public class main {

	/** Con Shift-Alt-J se añade javadoc
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		int n1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		int n2 = sc.nextInt();
		System.out.println("La suma resultante es: " + Suma.sumarDosNumeros(n1, n2));
		System.out.println("Introduce otro número: ");
		int n = sc.nextInt();
		System.out.println("La suma acumulada es: " + Suma.sumaAcumulada(n));
		
		System.out.println("Introduce el primer número: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		int num2 = sc.nextInt();
		System.out.println("La resta resultante es: " + Resta.restarDosNumeros(num1, num2));
		System.out.println("Introduce otro número: ");
		int num = sc.nextInt();
		System.out.println("La resta acumulada es: " + Resta.restaAcumulada(num));
		

		System.out.println("Linea que genera conflicto");
		System.out.println("Añadimos esta linea desde el REMOTO");
		System.out.println("Fin del programa");

	}

}
