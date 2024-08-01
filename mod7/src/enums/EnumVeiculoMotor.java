package enums;

public enum EnumVeiculoMotor {
	LINHA("linha"),
	W("w"),
	V("v");
	
	private String motor;
	
	EnumVeiculoMotor(String motor) {
		this.motor = motor;
	}
	
	public String getMotor() {
		return this.motor;
	}
}
