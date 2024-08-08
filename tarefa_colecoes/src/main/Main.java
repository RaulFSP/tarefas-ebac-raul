package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import classes.Pessoa;

public class Main {

	public static void main(String[] args) {

		/**
		 * Exercício parte 1
		 */
		Scanner sc = new Scanner(System.in);
		String[] entrada;

		entrada = sc.nextLine().toLowerCase().trim().split(",");
		List<String> nomes = new ArrayList<>();
		
		for(String nome: entrada) {
			nomes.add(nome);
		}
		
		Collections.sort(nomes);
		System.out.println(nomes);

		/**
		 * Exercício parte 2
		 */

		entrada = sc.nextLine().toLowerCase().trim().split(",");
		sc.close();
		Map<String, List<String>> pessoas = new HashMap<>();
		List<String> homens = new ArrayList<>();
		List<String> mulheres = new ArrayList<>();
		Pessoa pessoa = new Pessoa();
		for (String nome : entrada) {
			String[] temp = nome.split("-");
			if (temp.length == 2) {
				pessoa.setNome(temp[0]);
				pessoa.setSexo(temp[1]);
				if (pessoa.getSexo().equals("f")) {
					mulheres.add(pessoa.getNome());
				} else if (pessoa.getSexo().equals("m")) {
					homens.add(pessoa.getNome());
				}
			}
		}

		pessoas.put("f", mulheres);
		pessoas.put("m", homens);
		Collections.sort(pessoas.get("f"));
		Collections.sort(pessoas.get("m"));
		System.out.println("Mulheres");
		System.out.println(pessoas.get("f"));
		System.out.println("Homens");
		System.out.println(pessoas.get("m"));

	}

}
