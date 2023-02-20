package modelo.javabeans;


	/**
	 * 
	 * El objetivo de esta clase es representar a un jugador que tendrá 3 parámetros.
	 * Uno para saber su dorsal, otro para saber la cantidad de tarjetas amarillas 
	 * que ha recibido, y otro para saber la cantidad de tarjetas rojas que ha recibido.
	 * 
	 * Tendrá 2 métodos, el primero para asignarle un dorsal, y el otro para saber si debe ser expulsado o no.
	 * 
	 * 
	 * @author Alejandro Martín Fernández Prieto
	 * @version 1.0
	 *
	 */
	public class Jugador {
	
			/**
			 * Indica el dorsal que tiene el jugador.
			 */
		    private int dorsal;
		    
		    /**
		     * Indica la cantidad de tarjetas amarillas que ha recibido.
		     */
		    private int numeroTarjetasAmarillas;
		   
		    /**
		     * Indica la cantidad de tarjetas rojas que ha recibido.
		     */
		    private int numeroTarjetasRojas;
	
		    
		    /**
		     * Constructor por defecto
		     */
			public Jugador() {
				super();
			}

			/**
			 * Constructor con todos los parámetros de la clase			
			 * @param dorsal indica el dorsal que tiene el jugador.
			 * @param numeroTarjetasAmarillas indica la cantidad de tarjetas amarillas que ha recibido.
			 * @param numeroTarjetasRojas indica la cantidad de tarjetas rojas que ha recibido.
			 */
			public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
				super();
				this.dorsal = dorsal;
				this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
				this.numeroTarjetasRojas = numeroTarjetasRojas;
			}


			/**
			 * Este método se encarga de asignar un dorsal al jugador sobre el que apliquemos el método
			 * 
			 * Primero revisará si el dorsal introducido se encuentra entre el 1 y el 30 (inclusive), de ser así asignará dicho dorsal al jugador
			 * En caso contrario asignará el dorsal -1 al jugador
			 * 
			 * 
			 * @param dorsal número que queremos asignar como dorsal al jugador
			 */
			public void ponerDorsal(int dorsal) {
	            if(dorsal >= 1 && dorsal <= 30) {
	            	this.dorsal = dorsal;
	            }else {
	                this.dorsal = -1;
	            }
		    }
	
			/**
			 * Este método se encarga de decirnos si un jugador debe ser explusado o no en función de las tarjetas que le hayan mostrado
			 * Si tiene 2 tarjetas amarillas será expulsado y el método devolverá true
			 * Si tiene 1 tarjetas rojas será expulsado y el método devolverá true
			 * Si no tiene 2 tarjetas amarillas ni 1 tarjeta roja, el jugador no debe ser expulsado y el método devolverá false
			 * 
			 * @return si el jugador debe estar expulsado devuelve true, en caso contrario devuelve false
			 */

			 public boolean estaExpulsado() {
                 boolean expulsado = false;                                                  
                 if(numeroTarjetasAmarillas == 2) {
                	 expulsado = true;
                 }                          
                 if(numeroTarjetasRojas == 1) {
                	 expulsado = true;
                 }                          
                 return expulsado;
			 }
			
			
			//Getter and Setter
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
