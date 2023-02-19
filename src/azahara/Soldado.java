package azahara;

/**
 * El objetivo de esta clase es proporcionar información sobre un soldado.
 * 
 * Para ello, consta de diferentes métodos que nos proporcionan dicha información.
 * 
 * @author Azahara Fonseca Escudero
 */
public class Soldado {

	private boolean estaMuerto;
	private int numeroBalas;

	/** 
	 * Constructores.
	 */
	public Soldado() {
		super();
	}
	
	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
	
	/**
	 * Getters and setters
	 */
	
	public boolean getEstaMuerto() {
		return estaMuerto;
	}
	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}
	public int getNumeroBalas() {
		return numeroBalas;
	}
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
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
	 * @param sol  Hace referencia al soldado.
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		sol.estaMuerto = true;
	}

}

