package modelo.javabeans;

	/**
	 * El objetivo de esta clase representar un soldado con 2 atributos. 
	 * <br>
	 * El primero estaMuerto para saber si el soldado ha muerto o no,
	 * y el segundo numeroBalas para saber la cantidad de balas que le quedan al soldado
	 * <br>
	 * Tendrá 2 métodos, uno para saber si el soldado puede disparar y otro para realizar el acto de disparar
	 * <br>
	 * 
	 * @author Alejandro Martín Fernández Prieto
	 * @version 1.0
	 *
	 */

	public class Soldado {
	
			/**
			 * Indica si un soldado está muerto o no
			 */
		    private boolean estaMuerto;
		    
		    /**
		     * Indica el número de balas que le quedan al soldado
		     */
		    private int numeroBalas;
	    
		    /**
		     * Constructor por defecto
		     */
			public Soldado() {
				super();
			}
			
			/**
			 * Constructor con todos los parámetros de la clase
			 * @param estaMuerto indica si un soldado está muerto o no
			 * @param numeroBalas indica el número de balas que le quedan al soldado
			 */

			public Soldado(boolean estaMuerto, int numeroBalas) {
				super();
				this.estaMuerto = estaMuerto;
				this.numeroBalas = numeroBalas;
			}



			/**
			 * Método que revisa la cantidad de balas que le quedan al soldado y en función de las balas que le queden, nos dirá si puede
			 * disparar o no.
			 * 
			 * @return si el número de balas que le quedan al soldado es mayor que 0, devolverá true, de lo contrario, devolverá false
			 * 
			 */
			
			public boolean puedeDisparar() {
		        if(this.numeroBalas > 0) {
		                      return true;
		        }                          
		        return false;
		    }
		    
			/**
			 * Método que hace que el soldado sobre el que aplicamos el método dispare al soldado que pasamos como parámetro
			 * 
			 * Primero resta una bala al soldado que dispara y posteriormente cambia el atributo estaMuerto del soldado que pasamos como parámetro
			 * a true.
			 * 
			 * 
			 * @param sol representa al soldado al que vamos a disparar
			 * 
			 */
			
			public void disparar(Soldado sol) {
                this.numeroBalas--;
                sol.estaMuerto = true;
			}

		    //Getter and Setter
		    
			public boolean isEstaMuerto() {
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
