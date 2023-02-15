package Alfonso;

/**
 * 
 * Clase que representa a un Soldado. 
 * Esta clase será utilizada para un juego.
 * <br><br>
 * <b>Atributos de la clase</b>
 * 
 *  * <ul>
 * <li>estaMuerto</li>
 * <li>numeroBalas</li>
 * </ul>
 * 
 * @author Alfonso Lobato de la Sierra
 * @version 1.0
 */


public class Soldado {
	
	
	//ATRIBUTOS DEL SOLDADO
	/**
	 * Indica si el Soldado esta vivo o muerto. Si el valor es "True", el soldado esta Muerto. Si es "False" esta vivo.
	 */

	private boolean estaMuerto;
	
	/**
	 * Indica el número de balas que tiene un Soldado.
	 */
	private int numeroBalas;
	
	
	//CONSTRUCTORES
	
	/**
	 * Constructor por defecto
	 * 
	 */
	public Soldado() {
		super();
	}
	
	
	/**
	 * Constructor con parámetros
	 * @param estaMuerto representa si un soldado está muerto o no
	 * @param numeroBalas representa el nº de balas de un soldado
	 */
	
	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}


	/**
	 * 
	 * Método que devuelve si un Soldado puede disparar o no en base al numero de balas que tenga
	 * @return Si el numero de balas de un soldado es mayor que 0 devuelve True, en caso contrario devuelve false
	 */
	
	public boolean puedeDisparar() {
		
		if(this.numeroBalas > 0)
			return true;
		return false;
	}
	
	/**
	 * Método que hace disparar a un soldado que le hayamos pasado como parámetro. 
	 * 
	 * <br>Primero baja el numero de balas del soldado que ha disparado y luego mata al soldado que hayamos pasado como parámetro
	 * 
	 * @param sol Representa al soldado al que se le va a disparar.
	 */
	
	public void disparar(Soldado sol) {
		
		this.numeroBalas--;
		sol.estaMuerto = true;
		
	}
	
	
	//GETTERS & SETTERS
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
	
}
