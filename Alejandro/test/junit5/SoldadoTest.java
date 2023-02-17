package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.javabeans.Soldado;

class SoldadoTest {

	/**
	 * @author Alejandro Martín Fernández Prieto
	 */
	
	/**
	 * En este test vamos a probar el método puedeDisparar() que se encuentra implementado en la clase Soldado.
	 * <br><br>
	 * Debemos probar si al aplicar este método sobre un soldado que tiene un número positivo
	 * en su argumento numeroBalas, el método devuelve true, y por el contrario si el argumento numeroBalas
	 * del soldado sobre el que aplicamos en método es 0, el método devolverá false, ya que el
	 * soldado no puede disparar.
	 * <br><br>
	 * Para ello crearemos dos nuevos objetos de la clase Soldado, al primero le asignaremos un
	 * número positivo a su argumento numeroBalas, y al segundo le asiganremos 0 al mismo argumento.
	 * Al aplicar el método sobre el primer objeto nos devolverá true, ya que el soldado puede disparar,
	 * en el caso del segundo objeto, el método devolverá false, ya que el soldado no puede disparar
	 * al no tener balas.
	 */
	
	@Test
	void testPuedeDispararBalas() {
		Soldado sol1 = new Soldado();
		Soldado sol2 = new Soldado();
		
		sol1.setNumeroBalas(3);
		sol2.setNumeroBalas(0);
		
		assertTrue(sol1.puedeDisparar());
		assertFalse(sol2.puedeDisparar());
	}
	
	/**
	 * En este test vamos a probar el método disparar() que se encuentra implementado en la clase Soldado.
	 * <br><br>
	 * Debemos probar si despues de aplicar el método sobre un soldado, a este se le resta una bala de su
	 * argumento numeroBalas en caso de tener un número positivo en dicho argumento antes de aplicar el método sobre él.
	 * A su vez debemos comprobar que el argumento estaMuerto del soldado que pasamos como parámetro al método pasa a true.
	 * En caso de que el soldado sobre el que apliquemos el método tenga en su argumento numeroBalas un número menor a 1,
	 * el argumento estaMuerto del soldado que pasamos como parámetro no cambiará, ya que el soldado sobre 
	 * el que apliquemos el método no tiene balas para disparar, por lo tanto tampoco se le restará una bala de su
	 * argumento numeroBalas.
	 * <br><br>
	 * Para ello crearemos dos nuevos objetos de la clase Soldado, al primero le asignaremos un
	 * número positivo a su argumento numeroBalas, y al segundo le asiganremos 0 al mismo argumento.
	 * Además asignaremos false al argumento estaMuerto de ambos soldados.
	 * Primero haremos que el segundo soldado dispare al primero. Como el segundo soldado no tiene balas,
	 * el número de balas del segundo soldado seguirá siendo 0, y como al no tener balas no puede
	 * disparar, el primer soldado no estará muerto, por lo que su argumento estaMuerto seguirá siendo false.
	 * A continuación haremos que el primer soldado dispare al segundo, en este caso al argumento numeroBalas
	 * del primer soldado se le habrá restado una unidad, ya que ha disparado una bala, y el argumento
	 * estaMuerto del segundo soldado habrá cambiado a true, ya que ahora está muerto porque el primer soldado
	 * le ha disparado. 
	 */
	
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
