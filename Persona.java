import java.util.Scanner;

class Persona{

	private String name;
	private int age;
	private double w;

	// getters

	public String getName(){

		return this.name;	

	}

	public int getAge(){

		return this.age;

	}

	public double getW(){

		return this.w;	

	}

	// setters

	public void setName(String name){

		this.name = name;	

	}

	public void setAge(int age){

		this.age = age;

	}

	public void setW(double w){

		this.w = w;

	}

	public void pedirDatos(){
		
		Scanner leer = new Scanner(System.in);	

		System.out.println("Ingrese el nombre: ");

		this.setName(leer.nextLine());

		System.out.println("Ingrese la edad: ");

		this.setAge(leer.nextInt());

		System.out.println("Ingrese el peso: ");

		this.setW(leer.nextDouble());
	}

	public void mostrarDatos(){

		System.out.println("Nombre: "+ name);
		System.out.println("Edad: " + age);
		System.out.println("Peso: "+ w);

	}

}