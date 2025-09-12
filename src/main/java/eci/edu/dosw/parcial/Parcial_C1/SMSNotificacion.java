package eci.edu.dosw.parcial.Parcial_C1;

public class SMSNotificacion implements Notificacion{

    @Override
    public void send(MensajeNot msg){
        System.out.println("Enviando MSM a" + msg.getUsuario() + "con mensaje" + msg.getCuerpo() + "Niver de criticidad" + msg.getCriticidad());
    }
}
