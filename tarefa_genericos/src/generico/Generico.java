package generico;

import java.util.HashSet;
import java.util.Set;

import carro.Carro;

public class Generico<C extends Carro>
{
	private Set<C> carros;
	
	public Generico() {
		this.carros = new HashSet<C>();
	}
	
	public void adicionar(C carro) {
		this.carros.add(carro);
	}
	public void remover(C carro) {
		this.carros.remove(carro);
	}
	public void iterar() {
		this.carros.forEach(n->System.out.println(n.getNome()));
	}
	public void iterarClasses() {
		this.carros.forEach(n->System.out.println(n.getClass()));
	}
}
