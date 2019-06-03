package test;

import static org.junit.Assert.*;

import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import lfp.Arbitro;
import lfp.Equipo;
import lfp.ExcepcionLiga;
import lfp.Jugador;
import lfp.Liga;
import lfp.NoExisteEquipoExcepcion;

public class LigaTest {
	List<Equipo> listaEquipos = null;
	List<Jugador> listaJugadores = null;
	Equipo equip1 = null;
	Equipo equip2 = null;
	Jugador jug1 = null;
	Jugador jug2 = null;
	
	
	List<Arbitro> listaArbitros = null;
	Arbitro arbi1 = null;
			
	Liga lig1 = null;		
			
			
	@Before
	public void setUp() throws Exception {
		
		listaEquipos = new ArrayList<Equipo>();
		equip1 = new Equipo("real Zaragoza");
		equip2 = new Equipo("Leganés");
		
		listaEquipos.add(equip1);
		listaEquipos.add(equip2);
		
		
		listaJugadores = new ArrayList<Jugador>();
		
		jug1 = new Jugador(20, "Julia", "calle mayor", 1996, 'M', 2000, equip1);
		jug2 = new Jugador(34, "Agust", "Calle del Silencio", 1967, 'M', 2000, equip2);
		
		listaJugadores.add(jug1);
		listaJugadores.add(jug2);
		
		
		
		listaArbitros = new ArrayList<Arbitro>();
		
		arbi1 = new Arbitro(21, "Sergio", "Ermita del Santo", 1998, 'M', 3500, "Madrid");
		
		lig1 = new Liga(listaEquipos);
		
		
	}
	@Test
	public void testc () throws ExcepcionLiga {
		
		lig1.addArbitro(arbi1);
		
	}
	
	@Test
	public void testd () throws NoExisteEquipoExcepcion  {
		
		lig1.juegaPartido(equip1, equip2, 3, 1);
		
		
		//assertEquals(lig1.getClasificacion(),equip1);
		
	}


}
