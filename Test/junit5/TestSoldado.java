package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import azahara.Soldado;

class TestSoldado {

	@Test
	void testPuedeDispararBalas() {
		Soldado sol1 = new Soldado();
		Soldado sol2 = new Soldado();
		
		sol1.setNumeroBalas(3);
		sol2.setNumeroBalas(0);
		
		assertTrue(sol1.puedeDisparar());
		assertFalse(sol2.puedeDisparar());
	}
	

@Test
void testDisparar() {
	Soldado sol1 = new Soldado(false, 2);
	Soldado sol2 = new Soldado(false, 0);
	
	sol2.disparar(sol1);
	
	int resultadoEsperado1 = 0;
	int resultadoObtenido1 = sol2.getNumeroBalas();
	
	assertEquals(resultadoEsperado1, resultadoObtenido1);
	assertFalse(sol1.isEstaMuerto());
			
	sol1.disparar(sol2);
	
	int resultadoEsperado2 = 1;
	int resultadoObtenido2 = sol1.getNumeroBalas();
	
	assertEquals(resultadoEsperado2, resultadoObtenido2);		
	assertTrue(sol2.isEstaMuerto());
	
	
	
}

}
