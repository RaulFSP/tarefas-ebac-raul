package main.factory;

import main.carro.Carro;
import main.carro.Hatch;
import main.carro.Picape;
import main.carro.Seda;
import main.pessoa.Pessoa;

public class VolkswagenFactory implements Factory
{
	private Carro carro;

	@Override
	public void createCar(Pessoa pessoa)
	{
		switch (pessoa.getTrabalho())
		{
		case "viajar" -> this.carro = new Seda("Volkswagen", "vermelho", "Seda", 2019);
		case "transportar" -> this.carro = new Picape("Volkswagen", "azul", "picape", 2020);
		case "passear" -> this.carro = new Hatch("Volkswagen", "preto", "Hatch", 2022);
		default -> this.carro = null;
		}
	}

	@Override
	public Carro getResult()
	{
		return this.carro;
	}
}
