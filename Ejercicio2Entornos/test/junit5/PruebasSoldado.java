package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Alfonso.Soldado;

/**
 * 
 * @author Alfonso Lobato de la Sierra
 *
 */

class PruebasSoldado {

	/**
	 * <b>Testing método puedeDisparar().</b>
	 * <br><br>
	 * Para este test tendremos que pasar 2 pruebas mínimas;
	 * <br><br>
	 * 1. Se testeara si el soldado puede disparar si tiene balas, para ello primero crearemos un soldado, y le asignaremos
	 * 	  un numero de balas (40) mediante el método set y hacemos uso del assertTrue ya que el metodo tiene que 
	 * 	  devolver true si el soldado tiene balas.
	 * <br><br>
	 * 2. Se testeará tambien si el soldado puede disparar si no tiene balas, para ello ahora le asignaremos el numero de balas
	 *    a 0 y haremos uso del assertFalse ya que al no tener balas lo que se espera es que el método devuelva false 
	 */
	
	@Test
	void testPuedeDisparar() {
		Soldado soldado1 = new Soldado();
		soldado1.setNumeroBalas(40);
		
		assertTrue(soldado1.puedeDisparar()); 
		soldado1.setNumeroBalas(0);
		assertFalse(soldado1.puedeDisparar());
	}
	

	/**
	 * <b>Testing del método disparar()</b>
	 * <br><br>
	 * Para este test se crean dos soldados, el que dispara y el que es disparado tendremos que pasar 2 pruebas mínimas:
	 * <br><br>
	 * 1. Se testeara si el soldado disparado esta muerto, ya que una vez disparado, el método disparar pone el atributo de
	 *    estaMuerto a true, para ello primero le asignaremos un número de balas al soldado que va a disparar y posteriormente 
	 *    hacemos uso del assertTrue y le pasaremos como parámetro el método getEstaMuerto del soldado disparado que en este caso 
	 *    tendría que devolver true.
	 *<br><br>
	 * 2. Se testeará tambien si el número de balas del soldado que ha disparado ha disminiudo en 1. En este caso le habiamos asignado
	 * 	  100 balas al soldado que dispara por lo tanto el resultado esperado despues de ejecutar el método debe ser 99. 
	 * 	  Para obterner el numero de balas hacemos uso del método getNumeroBalas y posteriormente hacemos uso de assertEquals
	 *    para comprobar si el resultadoEsperado es igual que el resultadoObtenido
	 * 
	 * 
	 * 
	 */
	
	
	@Test
	void testDisparar() {
		
		Soldado soldado1 = new Soldado() ;
		Soldado soldado2 = new Soldado();
		soldado1.setNumeroBalas(100);
		soldado1.disparar(soldado2);
		assertTrue(soldado2.getEstaMuerto());
		
		int resultadoEsperado = 99;
		int resultadoObtenido = soldado1.getNumeroBalas();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
}