package Alfonso;

/**
 * 
 * Clase que representa a un Jugador. 
 * Esta clase será utilizada para un sistema de recolección de datos de jugadores de futbol.
 * <br><br>
 * <b>Atributos de la clase</b>
 * 
 * <ul>
 * <li>dorsal</li>
 * <li>numeroTarjetasAmarillas</li>
 * <li>numeroTarjetasRojas</li>
 * </ul>
 * 
 * @author Alfonso Lobato de la Sierra
 * @version 1.0
 */

public class Jugador {
	
	//ATRIBUTOS DEL SOLDADO
	
	/**
	 * Indica el dorsal de un jugador mediante un numero entero.
	 */
	private int dorsal;
	
	/**
	 * Indica el número de tarjetas amarillas de un jugador.
	 */
	private int numeroTarjetasAmarillas;
	
	/**
	 * Indica el número de tarjetas rojas de un jugador.
	 */
	private int numeroTarjetasRojas;
	
	/**
	 * 
	 */
	
	//CONSTRUCTORES
	
	/**
	 * Constructor por defecto
	 */

	public Jugador() {
		super();
	}
	
	/**
	 * 
	 * Constructor con parámetros
	 * @param dorsal representa el número de dorsal
	 * @param numeroTarjetasAmarillas representa el numero de tarjetas amarillas
	 * @param numeroTarjetasRojas representa el numero de tarjetas rojas
	 */
	
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	
	/**
	 * Método que se encargar de poner un dorsal a un jugador. 
	 * <br> El dorsal pasado como parámetro solo puede estar entre el 1 y el 30. En este caso se le asignara el dorsal elegido
	 * <br> Si se le pasa como parámetro un dorsal que no este en el rango, se le asignara al jugador el dorsal -1.
	 * @param dorsal Número del dorsal que vamos a introducir al jugador
	 */

	public void ponerDorsal(int dorsal) {
		
		if(dorsal>= 1 && dorsal <=30)
			this.dorsal = dorsal;
		else 
			this.dorsal=-1;
	}
	/**
	 * Método que indica si un jugador está expulsado o no según el numero de tarjetas amarillas o rojas.
	 *  <br> Si el numero de tarjetas amarillas es 2, el jugador está expulsado y el método devolvera true
	 *  <br> Si el número de tarjetas rojas es 1, el jugador está expulsado y el método devolvera true
	 *  <br> Sino se cumple ninguno de los casos anteriores, el jugador no está expulsado y el método devolvera false
	 * @return Devuelve un boolean que indica si está expulsado o no un jugador.
	 * En caso de que devuelva true el jugador está expulsado.
	 * Y en caso de que devuelva false el jugador no lo está.
	 */
	public boolean estaExpulsado() {
		
		boolean expulsado = false;
		
		if(numeroTarjetasAmarillas == 2)
			expulsado = true;
		if(numeroTarjetasRojas == 1)
			expulsado = true;
		
		return expulsado;
		
			
	//GETTER AND SETTERS	
		
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}


	
	
	
	
	
}
