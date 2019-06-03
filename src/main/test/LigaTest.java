package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import lfp.Arbitro;
import lfp.Equipo;
import lfp.ExcepcionLiga;
import lfp.Liga;
import lfp.NoExisteEquipoExcepcion;

public class LigaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Test(expected=ExcepcionLiga.class)
	public void test4() throws ExcepcionLiga 
	{
		Equipo equipo = new Equipo("Madrid");
		Equipo equipo2 = new Equipo("Sevilla");
		
	
		Arbitro arbitro = new Arbitro(26, "Rodolfo", "Calle Albarracin", 1992, 'H', 190.000, "Madrid");
		
		Liga liga1 = null;
		
				
		liga1.addEquipo(equipo);
		
		liga1.addArbitro(arbitro);
		
		liga1.addArbitro(arbitro);
		
		
		//int edad, String nombre, String direccion, int anyoNacimiento, char genero, double salario,String comunidadAutonoma
		
		
	}
	
	@Test
	public void juegaPartido() throws ExcepcionLiga, NoExisteEquipoExcepcion
	{
		Liga partido1 = new Liga(null);
		
		Equipo equipo = new Equipo("Madrid");
		Equipo equipo1 = new Equipo("Sevilla");
		
				
		partido1.addEquipo(equipo);
		
		partido1.addEquipo(equipo1);
				
		assertEquals(partido1.puntuacionObtenidaVisitante(4, 6);

	}
	
	

}