package classes;

import enums.EnumVeiculoModelo;
import enums.EnumVeiculoCilindrada;
import enums.EnumVeiculoCombustivel;
import enums.EnumVeiculoMotor;

/**
 * Projeto criado para o exercicio 7
 *@author raul pereira
 *@version 0.1
 *@since 01/08/2024 
 */
public class Veiculo {
	private EnumVeiculoCombustivel combustivel;
	private EnumVeiculoMotor motor;
	private EnumVeiculoModelo modelo;
	private EnumVeiculoCilindrada  cilindrada;
	private boolean  ligado;
	private String  nome;
	public EnumVeiculoCombustivel getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(EnumVeiculoCombustivel combustivel) {
		this.combustivel = combustivel;
	}
	public EnumVeiculoMotor getMotor() {
		return motor;
	}
	public void setMotor(EnumVeiculoMotor motor) {
		this.motor = motor;
	}
	public EnumVeiculoModelo getModelo() {
		return modelo;
	}
	public void setModelo(EnumVeiculoModelo modelo) {
		this.modelo = modelo;
	}
	public EnumVeiculoCilindrada getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(EnumVeiculoCilindrada cilindrada) {
		this.cilindrada = cilindrada;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Essa classe cria veículos
	 * @param combustivel
	 * escolha o cumbustivel
	 * @param motor
	 * escolha o motor
	 * @param modelo
	 * escolha o modleo
	 * @param cilindrada
	 * escolha a cilindrada do veiculo
	 * @param ligado
	 * escolha se o veiculo está ligado
	 * @param nome
	 * Dê um nome ao veículo
	 */
	public Veiculo(EnumVeiculoCombustivel combustivel, EnumVeiculoMotor motor, EnumVeiculoModelo modelo,
			EnumVeiculoCilindrada cilindrada, boolean ligado, String nome) {
		super();
		this.combustivel = combustivel;
		this.motor = motor;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.ligado = ligado;
		this.nome = nome;
	}
	
	
}
