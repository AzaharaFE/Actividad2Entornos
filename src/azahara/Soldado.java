package azahara;

public class Soldado {
	
	  private boolean estaMuerto;
      private int numeroBalas;  

        
      public boolean puedeDisparar() {
             if(this.numeroBalas > 0) {
            	 return true;
                }                          
                 return false;

      }

           public void disparar(Soldado sol) {
                    this.numeroBalas--;
                    sol.estaMuerto = true;
      }

}

