package clase_Abstracta;

public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pollos miPollos = new Pollos();
		
		miPollos.setNombre ("pollo Juan Pablo");
		
		miPollos.setColor("mis plumas son de color amarillas");
		
		miPollos.mostrar();
		
		
		Palomas miPalomas = new Palomas();
		
		miPalomas.setNombre("paloma Daniela");
		
		miPalomas.setColor("mis plumas son de color blancas");
		
		miPalomas.mostrar();
		
		
		Patos miPatos = new Patos();
		
		miPatos.setNombre("pato Aparato");
		
		miPatos.setColor("mis plumas son de color verdeazuladas");
		
		miPatos.mostrar();
		
						
	}

}
