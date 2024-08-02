package main;

import calcular_media.Media;

public class Main {

	public static void main(String[] args) {
		
		Media media = new Media(18,8,6,59);
		
		System.out.printf(
			"A média aritmética é %.4f%n",
			media.getResultado()
			);
		
	}
	

}
