
class Empleado {
	private String name;
	private int id;
	private double salario;
	
	public Empleado(String n, int id, double s){
	
		this.setName(n);
		this.setId(id);
		this.setSalario(s);
		
	}
	
	//-------------------------- setters ------------------------------------------------------------
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	//-------------------------- getters ------------------------------------------------------------
	
	public String getName(){
		return this.name;
	}
	
	public int getId(){
		return this.id;
	}
	
	public double getSalario(){
		return this.salario;
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
