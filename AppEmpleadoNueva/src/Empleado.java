
class Empleado {
	String name;
	int id;
	double salario;
	
	public Empleado(String n, int id, double s){
	
		this.name = n;
		this.id = id;
		this.salario = s;
		
	}
	
	public void actualizarSalario(){
	
		this.salario *= 1.25;
		
		System.out.println("El salario a sido actualizado");
		
	}
	/**
	 *muestra la colilla de pago
	 **/
	public void mostrarColillaPago(){
		
		double salud, rete, pension, neto;
		
		salud = this.salario * 0.04;
		
		rete = this.salario *0.10;
		
		pension = this.salario * 0.08;
		
		neto = this.salario - salud - pension - rete;
		
		System.out.println(  "CC: " + this.id+"\n"
						   + "Nombre: " + this.name + "\n"
						   + "---------------------\n"
						   + "Salario Bruto: " +this.salario + "\n"
						   + "Salud: " + salud + "\n"
						   + "Pension: " + pension + "\n"
						   + "Rete. Fuente: " + rete + "\n"
						   + "---------------------\n"
						   + "Salario Neto: " + neto);
		
	}
}
