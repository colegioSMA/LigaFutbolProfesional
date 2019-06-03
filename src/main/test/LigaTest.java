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
public class LigaTest {

	Arbitro arbitro1;
	Arbitro arbitro2;
	Equipo equipo1;
	Equipo equipo2;
	Liga liga;
	List<Equipo> listaEquipos;
	List<Arbitro> listaArbitros;

	@Before
	public void setUp() throws Exception {
		equipo1= new Equipo("Real Madrid");
		equipo2= new Equipo("Celta de Vigo");
		
		arbitro1=new Arbitro(30,"Mario","Alcorcon",1989,'H',1500.00,"Madrid");
		arbitro2=new Arbitro(30,"Borja","Alcobendas",1989,'H',1500.00,"Madrid");
		
		List<Equipo> listaEquipos=new ArrayList<>();
		listaEquipos.add(equipo1);
		listaEquipos.add(equipo2);
		

		
		liga=new Liga(listaEquipos);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=ExcepcionLiga.class)
	public void addArbitroTest() throws ExcepcionLiga {
		liga.addArbitro(arbitro1);
		liga.addArbitro(arbitro1);
		
		
	}
	
	
	@Test
	public void puntuacionObtenidaLocalTest() {
		
		assertEquals(3,liga.puntuacionObtenidaLocal(3, 2));
		
		
		
	}

}
