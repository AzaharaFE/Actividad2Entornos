package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Alfonso.Jugador;

class PruebasJugador {

	/**
	 * </b>Testing del método ponerDorsal</b>
	 * <br><br>
	 * Para este test se pasarán dos pruebas mínimas:
	 * <br><br>
	 * 1. Se testeará probando si al pasarle un numero del 1 al 30. Al ver el dorsal del jugador tiene que tener el dorsal
	 *    que le hayamos pasado como parámetro. Para ello primero crearemos al jugador y haremos uso del método poner dorsal
	 *    pasandole el numero 10, este será el resultado esperado. Para el resultado obtenido nos ayudaremos del método 
	 *    getDorsal(). Y se hace uso del assertEquals para comparar si el resultadoEsperado es igual al resultadoObtenido.
	 *<br><br>
	 * 2. Se testeará Probando si al pasarle un número mayor de 30 o menor de 1, el dorsal del jugador tiene que ser -1.
	 *    para ello le pasaremos como parámetro el número del dorsal 50, en este caso el resultado esperado será -1 y 
	 *    haremos uso del assertEquals para testear si son iguales.
	 * 
	 */
	 
	@Test
	void testPonerDorsalBien() {
		//TEST 1
		Jugador jugador1 = new Jugador();
		jugador1.ponerDorsal(10);
		int resultadoEsperado = 10;
		int resultadoObtenido = jugador1.getDorsal();
		assertEquals(resultadoEsperado , resultadoObtenido);
		//TEST 2
		Jugador jugador2 = new Jugador();
		jugador2.ponerDorsal(50);
		resultadoEsperado = -1;
		resultadoObtenido = jugador2.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	
	/**
	 *</b>Testing del método estaExpulsado</b>
	 *<br><br>
	 * Para este test tendremos que pasar 3 pruebas mínimas:
	 *<br><br> 
	 * 1. Se testeará probando que devuelve si el jugador tiene 2 tarjetas amarillas. Para ello se crea a un nuevo jugador1
	 *    y le asignaremos el numérp de tarjetas amarillas mediante su método set. Se hace uso del assertTrue ya qu
	 *    que el método en este caso tiene que devolver True ya que con 2 amarillas el jugador debería estar expulsado.
	 *<br><br>    
	 * 2. Se testeara probando que devuelve si el jugador tiene 1 tarjeta roja. Para ello se crea a un nuevo jugador2
	 *    y le asignaremos el numérp de tarjetas rojas mediante su método set. Se hace uso del assertTrue ya qu
	 *    que el método en este caso tiene que devolver True ya que con 1 roja el jugador debería estar expulsado.
	 *<br><br>     
	 * 3. Se testeará Probando que devuelve si el jugador tiene solo 1 tarjeta amarilla. Se crea a un nuevo jugador3 
	 *     y le asignaremos el numérp de tarjetas rojas mediante su método set. En este caso hacemos uso del assertFalse
	 *     ya que el método tiene que devolver False ya que con 1 amarilla el jugador no debería estar expulsado.
	 */     

	@Test
	void testEstaExpulsado(){
		//TEST 1 
		Jugador jugador1 = new Jugador();
		jugador1.setNumeroTarjetasAmarillas(2);
		assertTrue(jugador1.estaExpulsado());
		//TEST 2
		Jugador jugador2 = new Jugador();
		jugador2.setNumeroTarjetasRojas(1);
		assertTrue(jugador2.estaExpulsado());
		//TEST 3
		Jugador jugador3 = new Jugador();
		jugador3.setNumeroTarjetasAmarillas(1);
		assertFalse(jugador3.estaExpulsado());
			
	}
}
