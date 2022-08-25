import java.util.Scanner;
class Main{
	public static void main(String[] args){

		Scanner leer = new Scanner(System.in);

		float n1, n2, n3;

		System.out.println("Ingresar el primer numero");

		n1 = leer.nextFloat();

		System.out.println("Ingresar el segundo numero");

		n2 = leer.nextFloat();

		n3 = n1 + n2;

		System.out.println("El resultado de la suma de "+n1+" y "+n2+" es :"+n3);

	}
}