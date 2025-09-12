package eci.edu.dosw.parcial.Parcial_C1;

public class MovilNotificaciones implements Notificacion{
    @Override
    public void send(MensajeNot msg){
        System.out.println("Mensaje notificacion Push a " + msg.getUsuario() + "con cuerpo" + msg.getCuerpo() + "La criticidad es:" + msg.getCriticidad());
    }



}
