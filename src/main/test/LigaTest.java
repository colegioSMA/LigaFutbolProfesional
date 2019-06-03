package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import lfp.Arbitro;
import lfp.Equipo;
import lfp.ExcepcionLiga;
import lfp.Jugador;
import lfp.Liga;
import lfp.NoExisteEquipoExcepcion;

public class LigaTest {

	
	Liga liga = null;
	List<Equipo> listaEquipos = null;
	
	Arbitro arbitro = null;
	
	Equipo equip = null;
	Equipo equip2 = null;
	
	
	
	
	@Before
	public void setUp() throws Exception {
		
		
	liga = new Liga(listaEquipos);
		
	
	arbitro = new Arbitro(23, "Jorge", "zarza", 1999, 'M', 2000, "Madrid");	
		
	equip = new Equipo("sevilla");
	equip2 = new Equipo("madrid");
	
	
	}
	
	
	
	
	
	
	@Test (expected=ExcepcionLiga.class)
	public void actividad1c () throws ExcepcionLiga {
		
	
	
	liga.addArbitro(arbitro);
	
	
	
	
	}

	@Test
	public void ejercicio1d() throws NoExisteEquipoExcepcion {
		
	liga.juegaPartido(equip, equip2,  3,  4)  ;

	assertEquals(liga.puntuacionObtenidaLocal(4, 0), liga.puntuacionObtenidaVisitante(4, 0));
	
	
	
	}
	
	
	
	
	
}
