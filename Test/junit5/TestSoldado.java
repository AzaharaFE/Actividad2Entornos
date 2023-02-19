package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import azahara.Soldado;

class TestSoldado {
	
	/*
	 *  Test del método puedeDisparar() de la entidad Soldado. 
	 *  Para este test realizamos 2 pruebas mínimas.
	 */
	
	/**
	 * Se instancia una sola vez la entidad soldado, se setea el numero de balas a 10 
	 * para poder probar que el método puede disparar. Éste metodo nos devolverá 
	 * TRUE (si el numero de balas es mayor de cero) y FALSE si no.
	 * La segunda prueba consiste en setear el numero de balas a cero. En este caso 
	 * el assert consistirá en ver que el método puedeDisparar() devuelva FALSE.
	 */
	@Test
	void testPuedeDisparar() {
		Soldado soldado1 = new Soldado();
		soldado1.setNumeroBalas(10);
		
		assertTrue(soldado1.puedeDisparar()); 
		soldado1.setNumeroBalas(0);
		assertFalse(soldado1.puedeDisparar());
	}
	
	/*
	 *  Test del método Disparar() de la entidad Soldado. 
	 *  Para este test tendremos que pasar 2 pruebas mínimas.
	 */
	
	/**
	 * Prueba para testear el método estarMuerto() y para testear que el método Disparar()
	 * reduce el numero de balas del soldado instanciado.
	 * Para ello instanciamos dos veces la entidad soldado (soldado1 y soldado2).
	 * A (soldado1) le seteamos el numero de balas en (20) y llamamos a su método Disparar() 
	 * pasandole como parámetro el (soldado2).
	 * Con el primer assert comprobaremos que el (soldado2) tiene "estadoMuerto" utilizando el método 
	 * getEstaMuerto(). 
	 * Despues de esto comprobamos con otro assert que el (soldado1) ha reducido en 1 su numero de balas.
	 */
	@Test
	void testDisparar() {
		
		Soldado soldado1 = new Soldado() ;
		Soldado soldado2 = new Soldado();
		soldado1.setNumeroBalas(10);
		soldado1.disparar(soldado2);
		assertTrue(soldado2.getEstaMuerto());
		
		int resultadoEsperado = 9;
		int resultadoObtenido = soldado1.getNumeroBalas();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
}
