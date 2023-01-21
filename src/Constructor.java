
public class Constructor {

	public static void main(String[] args) {
		
		Cuadrado cua = new Cuadrado(); 
		
		System.out.println("El lado del cuadrado es: "+cua.ID);
		System.out.println("El perimetro es: "+cua.perimetro);
		System.out.println("El area es: "+cua.area);
		System.out.println("La diagonal es: "+cua.diagonal);
		
		cua.ingresaDato=11;
		System.out.println("el nuevo valor es: "+cua.ingresaDato);
		
		Circulo circu = new Circulo();
		
		System.out.println("El radio del circulo es: "+circu.ID);
		System.out.println("La circunferencia es: "+circu.circunferencia);
		System.out.println("El area del circulo es: "+circu.area);
		
		circu.ingresaDato=(float) 10;
		System.out.println("El nuevo valor es: "+circu.ingresaDato);
		
		

	}

}