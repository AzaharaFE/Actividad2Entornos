package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.javabeans.Jugador;

class JugadorTest {

	/**
	 * @author Alejandro Martín Fernández Prieto
	 */
	
	/**
	 * En este test vamos a probar el método ponerDorsal() que se encuentra implementado en la clase Jugador.
	 * <br><br>
	 * Debemos probar si pasándole como parámetro un número del 1 al 30, este método asigna
	 * al jugador sobre el que se aplica el dorsal pasado por parámetro.
	 * También debemos probar si pasándole como parámetro un número menor que 1 y mayor que 30, 
	 * este método asigna el número -1 al jugador sobre el que se aplica.
	 * <br><br>
	 * Para ello implementaremos un bucle for que pase como parámetro al método todos los números
	 * del 0 al 100. Cuando el número sea igual a 0 o mayor que 30, el método debe asignar -1 al
	 * dorsal del jugador, en caso contrario debe asignar el número pasado como parámetro en el
	 * método.
	 */
	
	@Test
	void testPonerDorsal() {
		
		Jugador jug1 = new Jugador();
		
		int resultadoEsperado = 0;
		int resultadoObtenido = 0;
		
		for (int i=0; i<=100; i++) {
			jug1.ponerDorsal(i);
			if (i==0 || i>30) {
				resultadoEsperado=-1;
				resultadoObtenido=jug1.getDorsal();
				assertEquals(resultadoEsperado, resultadoObtenido);
			}else {
				resultadoEsperado=i;
				resultadoObtenido=jug1.getDorsal();
				assertEquals(resultadoEsperado, resultadoObtenido);	
			}

		}
	}
	
	/**
	 * En este test vamos a probar el método estaExpulsado() que se encuentra implementado en la clase Jugador.
	 * <br><br>
	 * Debemos probar si cuando el jugador tiene menos de 2 tarjetas amarillas y 
	 * menos de 1 tarjeta roja, el método devuelve false porque el jugador no está expulsado
	 * También debemos probar si el método devuelve true cuando el jugador tiene 2 
	 * tarjetas amarilla o 1 tarjeta roja, ya que en este caso el jugador estaría expulsado
	 * <br><br>
	 * Para ello implementaremos un bucle for que se repita 6 veces para así poder probar todas
	 * las posibles combinaciones de tarjetas amarillas y tarjetas rojas que hay desde 0 a 2 tarjetas
	 * amarillas y desde 0 a 1 tarjetas rojas.
	 * Si el número de tarjetas amarillas es menor de 2 y el número de tarjetas rojas es menor de 1,
	 * el jugador no estará expulsado, por lo que el método devolverá false (solo existen dos posibilidades
	 * de que esto ocurra en el test, que el jugador tenga 0, tarjetas de ambos colores o que solamente tenga
	 * una tarjeta amarilla), en el resto de casos el método devolverá true, ya que el jugador al menos tendrá
	 * 2 tarjetas amarillas, 1 tarjeta roja o ambos casos ocurrirían a la vez, por lo
	 * tanto el jugador estará expulsado.
	 */
	
	@Test
	void testEstaExpulsado() {
		Jugador jug1 = new Jugador();
		
		int a = 0;
		int r = 0;
		
		for (int i=0; i<6; i++) {
		
			jug1.setNumeroTarjetasAmarillas(a);
			jug1.setNumeroTarjetasRojas(r);
			
			if (a<2 && r<1)
			assertFalse(jug1.estaExpulsado());
			else
			assertTrue(jug1.estaExpulsado());	
			
			if (a==2) {
				a=0;
				r++;
			}else
				a++;
		}
	}
}
