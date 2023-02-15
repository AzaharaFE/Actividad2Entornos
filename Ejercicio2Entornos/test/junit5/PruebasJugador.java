package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Alfonso.Jugador;

class PruebasJugador {

	/*
	 * Testing del método ponerDorsal, para este test vamos a tener que pasar dos pruebas mínimas:
	 * 1. Probando si al pasarle un numero del 1 al 30. Al ver el dorsal del jugador tiene que tener el dorsal indicado
	 * 2. Probando si al pasarle un número mayor de 30 o menor de 1, el dorsal del jugador tiene que ser -1
	 * 
	 */
	
	/**
	 * En este Test vamos a probar el método ponerDorsal, pasandole como parámetro el número del dorsal que queremos.
	 * En este caso probaremos pasarle como parámetro el número 10, al usar el método getDorsal el resultado obtenido tiene que ser 10
	 */
	 
	@Test
	void testPonerDorsalBien() {
		Jugador jugador1 = new Jugador();
		jugador1.ponerDorsal(10);
		int resultadoEsperado = 10;
		int resultadoObtenido = jugador1.getDorsal();
		assertEquals(resultadoEsperado , resultadoObtenido);
	}

	/**
	 * En este test vamos a probar el método ponerDorsal pasandole como parámetro un número de dorsal fuera del rango permitido (1 al 30)
	 * Vamos a pasarle como parámetro el número 50, al usar el método getDorsal el resultado obtenido tiene que ser -1.
	 */
	
	@Test
	void testPonerDorsalMal() {
		
		Jugador jugador1 = new Jugador();
		jugador1.ponerDorsal(50);
		int resultadoEsperado = -1;
		int resultadoObtenido = jugador1.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	/*
	 * Testing del método estaExpulsado, para este test vamos a pasar tres pruebas mínimas:
	 * 1. Probando que devuelve si el jugador tiene 2 tarjetas amarillas. El método tiene que devolver True.
	 * 2. Probando que devuelve si el jugador tiene 1 tarjeta roja. El método tiene que devolver True.
	 * 3. Probando que devuelve si el jugador tiene solo 1 tarjeta amarilla.
	 */
	
	
	/**
	 * En este test vamos a probar el método estaExpulsado si el jugador tiene 2 tarjetas amarillas.
	 * En este caso el método tiene que devolver true.
	 */
	
	@Test
	void testEstaExpulsado2Amarillas(){
		
		Jugador jugador1 = new Jugador();
		jugador1.setNumeroTarjetasAmarillas(2);
		assertTrue(jugador1.estaExpulsado());
		
	}
	
	
	/**
	 * En este test vamos a probar el método estaExpulsado si el jugador tiene 1 tarjeta roja.
	 * En este caso el método tiene que devolver true.
	 */
	
	@Test
	void testEstaExpulsado1Roja(){
		
		Jugador jugador1 = new Jugador();
		jugador1.setNumeroTarjetasRojas(1);
		assertTrue(jugador1.estaExpulsado());
		
	}
	
	
	/**
	 * En este test vamos a probar el método estaExpulsado si el jugador tiene 1 tarjeta amarilla.
	 * En este caso el método tiene que devolver false.
	 */
	
	@Test
	void testEstaExpulsado1Amarillas(){
		
		Jugador jugador1 = new Jugador();
		jugador1.setNumeroTarjetasAmarillas(1);
		assertFalse(jugador1.estaExpulsado());
		
	}
	
	
}

