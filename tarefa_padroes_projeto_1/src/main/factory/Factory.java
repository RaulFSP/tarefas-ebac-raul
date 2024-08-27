package main.factory;

import main.carro.Carro;
import main.pessoa.Pessoa;

public interface Factory
{
	public abstract void createCar(Pessoa pessoa);
	public abstract Carro getResult();
}
