package enums;

public enum EnumVeiculoModelo {
	SEDAN("sedan"),
	HATCH("hatch"),
	SUV("suv"),
	CONVERSIVEL("convercivel"),
	PICKUP("pickup"),
	COUPE("coupe"),
	MINIVAN("minivan");
	private String modelo;
	
	EnumVeiculoModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
}
