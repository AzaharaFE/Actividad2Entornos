package azahara;

/**
 * El objetivo de esta clase es proporcionar información sobre un jugador.
 * 
 * Para ello, consta de diferentes métodos que nos proporcionan dicha información.
 * 
 * @author Azahara
 */
public class Jugador {

	private int dorsal;
	private int numeroTarjetasAmarillas;
	private int numeroTarjetasRojas;

	/**
	 * Método que establece el valor del atributo dorsal. El número pasado por
	 * parámetro tiene que ser uno elegido entre 1 y 30. Si introducimos un valor
	 * distinto, el método nos devolverá el número (-1).
	 * 
	 * @param dorsal (Número de dorsal que vamos a introducir).
	 */
	public void ponerDorsal(int dorsal) {
		if (dorsal >= 1 && dorsal <= 30) {
			this.dorsal = dorsal;
		} else {
			this.dorsal = -1;
		}
	}

	/**
	 * Método que establece el valor de los atributos número de tarjetas amarillas o rojas.
	 * Si el número de tarjetas amarillas es igual a 2, el método devuelve true 
	 * y por tanto el jugador será expulsado.
	 * Si el número de tarjetas rojas es igual a 1, el método devuelve true y por tanto
	 * el jugador será expulsado.
	 * 
	 * @return expulsado.
	 */
	public boolean estaExpulsado() {
		boolean expulsado = false;
		if (numeroTarjetasAmarillas == 2) {
			expulsado = true;
		}
		if (numeroTarjetasRojas == 1) {
			expulsado = true;
		}  
                  return expulsado;
    }            

}

