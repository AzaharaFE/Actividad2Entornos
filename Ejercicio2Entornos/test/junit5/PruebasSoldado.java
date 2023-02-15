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

	/*
	 * Testing método puedeDisparar.
	 * Para este método tenemos que pasar 2 pruebas mínimas, ya que el método solo va a devolver true o false
	 */

	/**
	 *  En este Test vamos a probar si el soldado puede disparar si tiene balas
	 */
	
	@Test
	void testPuedeDispararConBalas() {
		Soldado soldado1 = new Soldado();
		soldado1.setNumeroBalas(40);
		
		assertTrue(soldado1.puedeDisparar()); //En este caso esperamos que devuelva TRUE ya que si tiene balas
		
	}
	
	/**
	 *  En este Test vamos a probar si el soldado puede disparar sino tiene balas
	 */
	
	@Test
	void testPuedeDispararSinBalas() {
		Soldado soldado1 = new Soldado();
		soldado1.setNumeroBalas(0);
		
		assertFalse(soldado1.puedeDisparar()); //En este caso se espera que devuelva FALSE, ya que no tiene balas
	
}

	/*
	 * Testing del método disparar
	 * Para este metodo vamos a crear dos soldados, el que dispara y el que es disparado y vamos a pasar 2 pruebas:
	 * Si cuando dispara el soldado muere
	 * Y Si cuando dispara el soldado que ha disparado tiene una bala menos.
	 */
	
	/**
	 *  En este Test vamos a comprobar si el soldado disparado muere
	 */
	
	@Test
	void testDisparar1() {
		
		Soldado soldado1 = new Soldado();
		Soldado soldado2 = new Soldado(false,50);
		soldado1.setNumeroBalas(100);
		soldado1.disparar(soldado2);
		assertTrue(soldado2.getEstaMuerto());
		
		
	}
	
	/**
	 * En este Test comprobaremos si el soldado que ha disparado tiene una bala menos
	 */
	
	@Test
	void testDisparar2() {
		
		Soldado soldado1 = new Soldado();
		Soldado soldado2 = new Soldado(false,50);
		soldado1.setNumeroBalas(100);
		soldado1.disparar(soldado2);
		int resultadoEsperado = 99;
		int resultadoObtenido = soldado1.getNumeroBalas();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		
	}
	


}