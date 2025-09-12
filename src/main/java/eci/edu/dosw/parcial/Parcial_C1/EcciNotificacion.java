package eci.edu.dosw.parcial.Parcial_C1;

/**
 *
 */
public class EcciNotificacion {

    public  static Notificacion crearNotificacion(Canal canal) {
        switch (canal) {
            case EMAIL:
                return new EmailNotificacion();
            case SMS:
                return new SMSNotificacion();
            case MOVIL:
                return new MovilNotificaciones();
            default:
                throw  new IllegalArgumentException("Canal no encontrado" + canal);
        }
    }
}
