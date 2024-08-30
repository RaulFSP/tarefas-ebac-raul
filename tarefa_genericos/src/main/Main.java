package main;

import carro.Camionete;
import carro.Carro;
import carro.Hatch;
import carro.Sedan;
import generico.Generico;

public class Main
{

	public static void main(String[] args)
	{
		Camionete car1 = new Camionete(1,"s10",2011);
		Hatch car2 = new Hatch(2,"hb20",2020);
		Sedan car3 = new Sedan(3,"corolla",2024);
		Generico<Carro> lista = new Generico<Carro>();
		lista.adicionar(car1);
		lista.adicionar(car2);
		lista.adicionar(car3);
		
		System.out.println("Carro adicionados em hashset genérico");
		lista.iterar();
		lista.iterarClasses();
		System.out.println("\nTeste de remoção genérico");
		lista.remover(car1);
		lista.iterar();
		lista.iterarClasses();
	}

}
