package lfp;



public class Arbitro extends Persona{

	private double salario;
	private String comunidadAutonoma;
	public Arbitro(int edad, String nombre, String direccion, int anyoNacimiento, char genero, double salario,
			String comunidadAutonoma) {
		super(edad, nombre, direccion, anyoNacimiento, genero);
		this.salario = salario;
		this.comunidadAutonoma = comunidadAutonoma;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getComunidadAutonoma() {
		return comunidadAutonoma;
	}
	public void setComunidadAutonoma(String comunidadAutonoma) {
		this.comunidadAutonoma = comunidadAutonoma;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comunidadAutonoma == null) ? 0 : comunidadAutonoma.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Arbitro && 
				super.equals(obj) &&
				((Arbitro)obj).salario == this.salario &&
				((Arbitro)obj).comunidadAutonoma.equals(this.comunidadAutonoma)){
					return true;
				}
				return false;
	}
	
	
	
}
