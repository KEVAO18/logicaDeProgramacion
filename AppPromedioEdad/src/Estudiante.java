/**
 * @(#)Estudiante.java
 *
 *
 * @author 
 * @version 1.00 2022/9/22
 */
 
import javax.swing.*;

public class Estudiante {
	
	private String nombre;
	private double notaPromedio;
	private int edad;

    public Estudiante() {
    	pedirDatos();
    }
    
	public Estudiante(String a, double b, int c) {
    	this.setNombre(a);
    	this.setEdad(c);
    	this.setNotaPromedio(b);
    }
    
    public void pedirDatos(){
    	Object[] data = {"Masculino","Femenino"};
    	this.setNombre(JOptionPane.showInputDialog("Ingresar el nombre del estudiante: "));
    	this.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad del estudiante: ")));
    	this.setNotaPromedio(Double.parseDouble(JOptionPane.showInputDialog("Ingresar la edad del estudiante: ")));
    	JComboBox combo = new JComboBox(data);
    	combo.setSelectedIndex(1);
    	JOptionPane.showMessageDialog(null, combo, "Genero", JOptionPane.QUESTION_MESSAGE);
    	
    	JOptionPane.showMessageDialog(genero);
    }
    
    public void setNombre(String nombre){
		this.nombre = nombre;
    }
    
    public void setNotaPromedio(double notaPromedio){
		this.notaPromedio = notaPromedio;
    }
    
	public void setEdad(int edad){
		this.edad = edad;
    }
    
    public String getNombre(){
		return this.nombre;
    }
    
    public double getNotaPromedio(){
		return this.notaPromedio;
    }
    
	public int getEdad(){
		return this.edad;
    }
    
    
}