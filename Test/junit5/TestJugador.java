package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import azahara.Jugador;

class TestJugador {

	/*
	 * Test del método ponerDorsal() de la entidad Jugador.
	 * Para este test realizamos dos pruebas mínimas.
	 */
	
	
	/**
	 * La primera prueba servirá para verificar si al pasar un Nº del 1 al 30, 
	 * el dorsal del jugador tiene dicho numero.
	 * En este caso le pasamos como parámetro el número 17, al usar el método getDorsal,
	 * el resultado obtenido tiene que ser 17.
	 */
	 
	@Test
	void testPonerDorsalBien() {
		Jugador jugador1 = new Jugador();
		jugador1.ponerDorsal(17);
		int resultadoEsperado = 17;
		int resultadoObtenido = jugador1.getDorsal();
		assertEquals(resultadoEsperado , resultadoObtenido);
	}

	/**
	 *La segunda prueba será para verificar si al pasar un Nº mayor de 30 o menor de 1, 
	 * el dorsal del jugador muestra -1.
	 * En este caso pasamos como parámetro el número 32, al usar el método getDorsal,
	 * el resultado obtenido tiene que ser -1.
	 */
	
	@Test
	void testPonerDorsalMal() {
		
		Jugador jugador1 = new Jugador();
		jugador1.ponerDorsal(32);
		int resultadoEsperado = -1;
		int resultadoObtenido = jugador1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	/*
	 *  Test del método estaExpulsado() de la entidad Jugador.
	 *  Para este test realizamos tres pruebas mínimas:
	 */
	 
	/**
	 * Si el número de tarjetas amarillas es igual a 2, el método devuelve TRUE y
	 * por tanto el jugador será expulsado.
	 */
	
	@Test
	void testEstaExpulsado2Amarillas(){
		
		Jugador jugador1 = new Jugador();
		jugador1.setNumeroTarjetasAmarillas(2);
		assertTrue(jugador1.estaExpulsado());
		
	}
		
	/**
	 * Si el número de tarjetas rojas es igual a 1, el método devuelve TRUE y por tanto
	 * el jugador será expulsado.
	 */
	
	@Test
	void testEstaExpulsado1Roja(){
		
		Jugador jugador1 = new Jugador();
		jugador1.setNumeroTarjetasRojas(1);
		assertTrue(jugador1.estaExpulsado());

	}
		
	/**
	 * Si el jugador tiene sólo 1 tarjeta amarilla. El método devuelve FALSE y por tanto,
	 * el jugador no sería expulsado.
	 */
	
	@Test
	void testEstaExpulsado1Amarillas(){
		
		Jugador jugador1 = new Jugador();
		jugador1.setNumeroTarjetasAmarillas(1);
		assertFalse(jugador1.estaExpulsado());
		
	}
	
}
