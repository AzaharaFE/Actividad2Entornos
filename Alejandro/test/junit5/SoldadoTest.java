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
	 * Debemos probar si después de aplicar el método sobre un soldado, a este se le resta una bala de su
	 * argumento numeroBalas.
	 * <br><br>
	 * Para ello crearemos dos nuevos objetos de la clase Soldado, al primero le asignaremos un
	 * número positivo a su argumento numeroBalas.
	 * Además asignaremos false al argumento estaMuerto de ambos soldados.
	 * Haremos que el primer soldado dispare al segundo, al argumento numeroBalas
	 * del primer soldado se le habrá restado una unidad, ya que ha disparado una bala, y el argumento
	 * estaMuerto del segundo soldado habrá cambiado a true, ya que ahora está muerto porque el primer soldado
	 * le ha disparado. 
	 */
	
	@Test
	void testDisparar() {
		Soldado sol1 = new Soldado(false, 2);
		Soldado sol2 = new Soldado(false, 0);
				
		sol1.disparar(sol2);
		
		int resultadoEsperado2 = 1;
		int resultadoObtenido2 = sol1.getNumeroBalas();
		
		assertEquals(resultadoEsperado2, resultadoObtenido2);		
		assertTrue(sol2.isEstaMuerto());
	}

}
