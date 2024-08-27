package main.carro;

public abstract class Carro
{
	private String marca;
	private String cor;
	private String tipo;
	private Integer ano;

	public String getMarca()
	{
		return marca;
	}

	public String getCor()
	{
		return cor;
	}

	public String getTipo()
	{
		return tipo;
	}

	public Integer getAno()
	{
		return ano;
	}

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public void setAno(Integer ano)
	{
		this.ano = ano;
	}

	public Carro(String marca, String cor, String tipo, Integer ano)
	{

		this.marca = marca;
		this.cor = cor;
		this.tipo = tipo;
		this.ano = ano;
	}

	@Override
	public String toString()
	{
		return "Carro [marca=" + marca + ", cor=" + cor + ", tipo=" + tipo + ", ano=" + ano + "]";
	}
	
}
