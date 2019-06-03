package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lfp.Equipo;
import lfp.Jugador;

public class EquipoTest {
	Equipo equipo1;
	List<Jugador> listaJugadores=null;
	List<Jugador> listaJugadores2=null;
	Jugador jugador1=null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		equipo1 = new Equipo("Real Sociedad");
		listaJugadores= new ArrayList<>();
		listaJugadores2= new ArrayList<>();
		jugador1= new Jugador(23, "Antonio", "Madrid", 1992, 'H', 25, equipo1);
		listaJugadores2.add(jugador1);
		equipo1.setListaJugadores(listaJugadores);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void esEquipoRealtest() {
		assertTrue(equipo1.esEquipoReal());
		assertFalse(!equipo1.esEquipoReal());
	}
	@Test
	public void anadeJugadorTest() {
		equipo1.anadeJugador(jugador1);
		assertArrayEquals(listaJugadores.toArray(), listaJugadores2.toArray());
		
		
	}
	

}
