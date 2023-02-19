package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import azahara.Jugador;

class TestJugador {

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
	

		@Test
		void testEstaExpulsado() {
			Jugador jug1 = new Jugador();

			int a = 0;
			int r = 0;

			for (int i = 0; i < 12; i++) {

				jug1.setNumeroTarjetasAmarillas(a);
				jug1.setNumeroTarjetasRojas(r);

				if (a < 2 && r < 1)
					assertFalse(jug1.estaExpulsado());
				else
					assertTrue(jug1.estaExpulsado());

				if (a == 3) {
					a = 0;
					r++;
				} else
					a++;
			}

		}
	}
