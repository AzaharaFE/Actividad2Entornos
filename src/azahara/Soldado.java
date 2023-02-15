package azahara;

/**
 * El objetivo de esta clase es proporcionar información sobre un soldado.
 * 
 * Para ello, consta de diferentes métodos que nos proporcionan dicha información.
 * 
 * @author Azahara
 */
public class Soldado {

	private boolean estaMuerto;
	private int numeroBalas;

	/**
	 * Método que establece el valor del atributo número de balas. Si el número pasado
	 * por parámetro es mayor de cero, el método devuelve true y por tanto, el soldado
	 * puede disparar. Si por el contrario, el valor introducido es menor o igual a cero,
	 * el método devuelve false y por tanto el soldado no puede disparar.
	 * 
	 * @return true/false
	 */
	public boolean puedeDisparar() {
		if (this.numeroBalas > 0) {
			return true;
		}
		return false;

	}

	/**
	 * 
	 * @param sol  Hace referencia al soldado.
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}

}

