package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lfp.*;

public class EquipoTest {

	
	Equipo equipo1;
	Equipo equipo2;
	Jugador jugador1;
	Jugador jugador2;
	Jugador jugador3;
	private List<Jugador> listaJugadores;
	@Before
	public void setUp() throws Exception {
		
		equipo1= new Equipo("Real Madrid");
		equipo2= new Equipo("Celta de Vigo");
		
		
		jugador1=new Jugador(24,"Sergio","Leganes",1994,'H',1500.00,equipo1);
		jugador1=new Jugador(25,"Juan","Carabanchel",1992,'H',1500.00,equipo2);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void esEquipoRealTest() {
		assertTrue(equipo1.esEquipoReal());
		assertFalse(equipo2.esEquipoReal());
	}
	
	@Test
	public void anadeJugadorTest() {
		List<Jugador> aux = new ArrayList <>();
		aux.add(jugador1);
		aux.add(jugador2);
		equipo1.anadeJugador(jugador1);
		equipo1.anadeJugador(jugador2);
		assertArrayEquals(aux.toArray(),equipo1.getListaJugadores().toArray());
		
	}
	
	

}
