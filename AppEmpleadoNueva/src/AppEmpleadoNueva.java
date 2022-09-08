import java.util.*;
 
public class AppEmpleadoNueva {
    
    public static void main(String[] args) {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	String n;
    	int id;
    	double s;
    	Empleado nn;
    	
    	System.out.print("Ingrese el Nombre del empleado: ");
    	
    	n = leer.nextLine();
    	
    	System.out.print("Ingrese el documento del empleado: ");
    	
    	id = leer.nextInt();
    	
    	System.out.print("Ingrese el salario actual del empleado: ");
    	
    	s = leer.nextDouble();
    	
    	nn = new Empleado(n, id, s);
    	
    	nn.actualizarSalario();
    	
    	nn.mostrarColillaPago();
    }
}
