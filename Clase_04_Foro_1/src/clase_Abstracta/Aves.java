package clase_Abstracta;

public abstract class Aves {
	
	private String nombre;
	private String color;
	
	public void setNombre (String nombre) {
		
		this.nombre = nombre;
	}
	
	public String getNombre (String nombre) {
		
		return this.nombre;
	}
	
	public String setColor (String color) {
		
		return this.color = color;
	}
	
	public abstract String andar();
	
	public void mostrar() {
		
		System.out.println("Soy un "+ this.nombre);
		
		System.out.println("y " + this.color);
		
		System.out.println("y " + andar());
		
		System.out.println("----------------------------------------------------------");
	}

}
