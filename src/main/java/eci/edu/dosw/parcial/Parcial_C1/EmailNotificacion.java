package eci.edu.dosw.parcial.Parcial_C1;

public class EmailNotificacion implements Notificacion {

    @Override
    public void send(MensajeNot msg){
        System.out.println("Enviando  Email a " + msg.getUsuario() + " con asunto " + msg.getAsunto() + " con cuerpo " + msg.getCuerpo() + " Nivel  de criticidad  " + msg.getCritico());

    }

}
