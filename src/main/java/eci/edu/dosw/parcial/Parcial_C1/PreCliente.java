package eci.edu.dosw.parcial.Parcial_C1;

/**
 * Se define la preferencia del cliente
 * para la notificacion de alerta
 */
public class PreCliente {
    private Canal canalElegido;
    private int critico;

    public PreCliente(Canal canalElegido, boolean critico){
        this.canalElegido = canalElegido;
        this.critico = critico
    }

    public Canal getCanalElegido(){
        return canalElegido
    }

    public int isCritico() {
        return critico;
    }
}
