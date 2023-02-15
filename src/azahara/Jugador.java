package azahara;

public class Jugador {
	private int dorsal;
    private int numeroTarjetasAmarillas;
    private int numeroTarjetasRojas;
  
    public void ponerDorsal(int dorsal) {
                  if(dorsal >= 1 && dorsal <= 30) {
                     this.dorsal = dorsal;
                  }else {
                     this.dorsal = -1;
                 }
    }
    
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

}

