package enums;

public enum EnumVeiculoCombustivel {
	DIESEL("diesel"),
	GASOLINA("gasolina"),
	ALCOOL("alcool"),
	FLEX("flex");
	
	private String combustivel;
	
	EnumVeiculoCombustivel(String combustivel){
		this.combustivel = combustivel;
	}
	public String getCombustivel() {
		return this.combustivel;
	}
}
