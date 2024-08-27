package main;

import main.pessoa.Pessoa;

import java.util.ArrayList;

import main.carro.Carro;
import main.factory.FordFactory;
import main.factory.VolkswagenFactory;
public class Main
{

	public static void main(String[] args)
	{
		ArrayList<Carro> carroList = new ArrayList<Carro>();
		// objetos pessoas
		Pessoa pessoa1 = new Pessoa("viajar");
		Pessoa pessoa2 = new Pessoa("transportar");
		Pessoa pessoa3 = new Pessoa("passear");

		// objetos de fabricas
		FordFactory fordFactory = new FordFactory();
		VolkswagenFactory volkswagenFactory = new VolkswagenFactory();
		
		// resultado da  fordfactory
		fordFactory.createCar(pessoa1);
		carroList.add(fordFactory.getResult());
		
		fordFactory.createCar(pessoa2);
		carroList.add(fordFactory.getResult());
		
		fordFactory.createCar(pessoa3);
		carroList.add(fordFactory.getResult());
		
		// resultado da  volkswagenFactory
		volkswagenFactory.createCar(pessoa1);
		carroList.add(volkswagenFactory.getResult());
		
		volkswagenFactory.createCar(pessoa2);
		carroList.add(volkswagenFactory.getResult());
		
		volkswagenFactory.createCar(pessoa3);
		carroList.add(volkswagenFactory.getResult());
		
		carroList.forEach(n -> System.out.println(n.getClass()));
		
	}

}
