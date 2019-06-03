package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import lfp.Equipo;
import lfp.Jugador;





public class EquipoTest {

	
	Equipo equip = null;
	Equipo equip2 = null;
	
	List<Jugador> listaJugadores = null;
	
	Jugador jugador1 = null;
	Jugador jugador2 = null;
	
	
	
	
	
	
	@Before
	public void setUp() throws Exception {
		
		listaJugadores = new ArrayList<Jugador>();
	
		jugador1 = new Jugador(20, "Jorge", "zarzamora", 1999 , 'M', 2000, equip);
		jugador2 = new Jugador(20, "Jose", "zarzamora", 1999 , 'M', 2000, equip2);
		
		
		
		equip = new Equipo("real Madrid");
		equip2 = new Equipo("Madrid");	
		
		
	
		
		
		
	}
	
	
	
	
	
	
	@Test
	public void ejercicio1a() {
		
	
	assertTrue(equip.esEquipoReal());
	
	assertFalse(equip2.esEquipoReal());	
	
	
	
	
	
	
	
	}

	@Test
	public void ejercicio1b() {
		
	
	equip.anadeJugador(jugador1);
	
	listaJugadores.add(jugador1);
	
	
	assertArrayEquals(listaJugadores.toArray(), equip.getListaJugadores().toArray());
	
	
	
	
	}
	
	
	
	
	
	
}
