package calcular_media;

public class Media {

	private double n1,n2,n3,n4,resultado;

	public Media(double n1,double n2,double n3,double n4){
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		setResultado();
	}
	private void setResultado() {
		this.resultado = (this.n1+this.n2+this.n3+this.n4)/4.0;
	}
	
	public double getResultado() {
		return this.resultado;
	}
}
