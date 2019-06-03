package Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import lfp.Arbitro;
import lfp.Equipo;
import lfp.ExcepcionLiga;
import lfp.Liga;
import lfp.NoExisteEquipoExcepcion;

public class LigaTest {
	Liga liga1=null;
	List<Arbitro> listaArbitros = null;
	List<Equipo> listaEquipos = null;
	Equipo equipo1= null;
	Equipo equipoLocal= null;
	Equipo equipoVisitante= null;
	Map<Equipo, Integer> clasificacion1 = null;
	
	Arbitro arbitro1= null;
	Arbitro arbitro2= null;
	int golLocal;
	int golVisitante;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		equipo1= new Equipo("Real Betis");
		equipoLocal= new Equipo("Valencia");
		equipoVisitante= new Equipo("Espanyol");
		golLocal=2;
		golVisitante=1;
		clasificacion1= new HashMap<Equipo, Integer>();
		
		arbitro1= new Arbitro(22, "Jesus", "Madrid", 1990, 'H', 2000, "Madrid");
		listaEquipos= new ArrayList<>();
		listaEquipos.add(equipo1);
		liga1= new Liga(listaEquipos);
		listaArbitros= new ArrayList<>();
		listaArbitros.add(arbitro1);
		liga1.setListaArbitros(listaArbitros);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected= ExcepcionLiga.class)
	public void addArbitroTest() throws ExcepcionLiga {
		liga1.addArbitro(arbitro1);
		

	}
	@Test(expected= NoExisteEquipoExcepcion.class)
	public void  juegaPartidoTest() throws NoExisteEquipoExcepcion {
		liga1.juegaPartido(equipoLocal, equipoVisitante, golLocal, golVisitante);
		
	}
	@Test
	public void puntuacionObtenidaLocalTest() {
		assertEquals(3,liga1.puntuacionObtenidaLocal(3, 2));
		
		
		
	}

}
