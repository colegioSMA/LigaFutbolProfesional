package lfp;

public class Jugador extends Persona{

	private double salario;
	private Equipo equipo;
	public Jugador(int edad, String nombre, String direccion, int anyoNacimiento, char genero, double salario,
			Equipo equipo) {
		super(edad, nombre, direccion, anyoNacimiento, genero);
		this.salario = salario;
		this.equipo = equipo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Jugador && 
				super.equals(obj) &&
				((Jugador)obj).salario == this.salario &&
				((Jugador)obj).equipo.equals(this.equipo)){
					return true;
				}
				return false;
	}
	
	
}
