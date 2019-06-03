package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import lfp.Equipo;
import lfp.Jugador;

public class EquipoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


		@Test
		public void test2() 
		{
			Equipo equipo1 = new Equipo("Real Madrid");
			Equipo equipo = new Equipo("Sevilla");
			
			assertTrue(equipo1.esEquipoReal());
			assertFalse(equipo.esEquipoReal());
		}
		
		@Test
		public void AñadeJugador() 
		{
			Jugador jugador;
			Equipo equipo1 = new Equipo("Madrid");
			
			jugador = new Jugador(10, "Juan", "Lopez", 50, 'H', 150.000, equipo1);
			
			equipo1.anadeJugador(jugador);

			
		}
	}


