
public class Cuadrado {
	public int ID;
	public int perimetro;
	public long area;
	public double diagonal;
	public int ingresaDato;
	
	public Cuadrado() {
		this.ID=ID;
		this.perimetro= perimetro;
		this.area=area;
		this.diagonal=diagonal;
		this.ingresaDato=ingresaDato;
		
		
		ID =172020;
		perimetro=ID*4;
		area=(long)ID*ID;
		diagonal=(double)Math.sqrt(Math.pow(ID, 2)+Math.pow(ID, 2));
		ingresaDato=ingresaDato;
	}

}
