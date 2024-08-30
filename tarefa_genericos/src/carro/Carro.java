package carro;

import java.util.Objects;

public abstract class Carro
{
	private Integer numero;
	private String nome;
	private Integer ano;
	public Carro(Integer numero, String nome, Integer ano)
	{
		super();
		this.numero = numero;
		this.nome = nome;
		this.ano = ano;
	}
	public Integer getNumero()
	{
		return numero;
	}
	public String getNome()
	{
		return nome;
	}
	public Integer getAno()
	{
		return ano;
	}
	public void setNumero(Integer numero)
	{
		this.numero = numero;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public void setAno(Integer ano)
	{
		this.ano = ano;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(ano, nome, numero);
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(ano, other.ano) && Objects.equals(nome, other.nome)
				&& Objects.equals(numero, other.numero);
	}
	

	

	

	

	
}
