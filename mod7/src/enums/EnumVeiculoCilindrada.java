package enums;

public enum EnumVeiculoCilindrada {
	CC1000("1.0"),
	CC1400("1.4"),
	CC1600("1.6"),
	CC1800("1.8"),
	CC2000("2.0");
	
	private String cilindrada;
	EnumVeiculoCilindrada(String cilindrada){
		this.cilindrada = cilindrada;
	}
	public String getCilindrada() {
		return this.cilindrada;
	}
}
