package classes;

public class Conversor
{
	private  Integer inteiro;
	private  Double flutuante;
	private  Boolean booleano;
	private  Long longo;
	
	public Integer paraInteiro(int inteiro) {
		this.inteiro = inteiro;
		return this.inteiro;
	}
	
	public Double paraDouble(double flutuante) {
		this.flutuante = flutuante;
		return this.flutuante;
	}
	
	public Boolean paraBoolean(boolean booleano) {
		this.booleano = booleano;
		return this.booleano;
	}
	
	public Long paraLong(Long longo) {
		this.longo = longo;
		return this.longo;
	}
}
