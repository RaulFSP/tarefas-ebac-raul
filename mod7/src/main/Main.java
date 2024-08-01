package main;

import classes.Veiculo;
import enums.*;

/**
 * @author raul pereira
 */

public class Main {

	public static void main(String[] args) {
		
		Veiculo veiculo1 = new Veiculo(
				EnumVeiculoCombustivel.FLEX,
				EnumVeiculoMotor.LINHA,
				EnumVeiculoModelo.HATCH,
				EnumVeiculoCilindrada.CC1400,
				true, 
				"pálio");
		
		iteradorVeiculo(veiculo1);
		
		veiculo1.setCombustivel(EnumVeiculoCombustivel.ALCOOL);
		
		iteradorVeiculo(veiculo1);
		
		Veiculo veiculo2 = new Veiculo(
				EnumVeiculoCombustivel.DIESEL,
				EnumVeiculoMotor.V,
				EnumVeiculoModelo.PICKUP,
				EnumVeiculoCilindrada.CC2000,
				true, 
				"s10");
		iteradorVeiculo(veiculo2);
	}
	
	static void iteradorVeiculo(Veiculo veiculo) {
		System.out.printf(
				"%s %s %s motor em %s modelo %s.%n",
				veiculo.getNome(),
				veiculo.getCilindrada().getCilindrada(),
				veiculo.getCombustivel().getCombustivel(),
				veiculo.getMotor().getMotor(),
				
				veiculo.getModelo().getModelo()
				);
	}

}
