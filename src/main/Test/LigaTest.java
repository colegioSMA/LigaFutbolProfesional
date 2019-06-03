package Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import lfp.Arbitro;
import lfp.Equipo;
import lfp.ExcepcionLiga;
import lfp.Jugador;
import lfp.Liga;
import lfp.NoExisteEquipoExcepcion;
import lfp.Persona;


class LigaTest {
Arbitro arbitro1 = null;
Equipo equipo1 = null;
Equipo equipoLocal = null;
ExcepcionLiga excepcion1 = null;
Jugador jugador1 = null;
Liga liga1 = null;
NoExisteEquipoExcepcion noExiste1 = null;
Persona persona1 = null;
	

	
	
	@Before
	public void setUp() throws Exception {
		
		arbitro1 = new Arbitro(21,"Pepe","avenida tomate",1998,'M',1000.21,"madrid");
		equipoLocal = new Equipo("Alava");
	}


	@Test
	public void addArbitro() throws ExcepcionLiga{
		ArrayList<Arbitro> arbitro = new ArrayList<>();
		arbitro.add(arbitro1);
		
	    arbitro1.addArbitro();
		//salta error no se porque 
	}

	@Test
	public void juegaPartido() {
	//no me da tiempo pero se haria un contador de puntos y se veria si se suman bn con el array equals
		
		assertEquals();
	}
}
