import java.util.Scanner;
public class Rectangulo{
	private float base;
	private float altura;
	private float area;
	private float perimetro;

	public void pedirDatos(){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingresar la base del rectangulo: ");
		this.setBase(leer.nextFloat());
		System.out.println("Ingresar la altura del rectangulo: ");
		this.setAltura(leer.nextFloat());
	}

	public String area(){
		this.area = this.base * this.altura;
		return "la base es: "+this.area;
	}

	public String perimetro(){
		this.perimetro = this.base * 2 + this.altura * 2;
		return "El perimetro es: "+this.perimetro;
	}

	public void setBase(float base){
		this.base = base;
	}

	public void setAltura(float altura){
		this.altura = altura;
	}

	public float getBase(){
		return this.altura;
	}

	public float getAltura(){
		return this.altura;
	}
}