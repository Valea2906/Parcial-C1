package eci.edu.dosw.parcial.Parcial_C1;

/**
 *
 */
public class EcciNotificacion {
    public static Notificacion crearNotificacion(Canal canal) {
        if (canal == null) {
            throw new IllegalArgumentException("El canal no puede ser null");
        }

        switch (canal) {
            case EMAIL:
                return new EmailNotificacion();
            case SMS:
                return new SMSNotificacion();
            case MOVIL:
                return new MovilNotificaciones();
            default:
                throw new IllegalArgumentException("Canal no soportado: " + canal);
        }
    }
}


