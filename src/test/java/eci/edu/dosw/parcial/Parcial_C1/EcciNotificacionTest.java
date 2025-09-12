package eci.edu.dosw.parcial.Parcial_C1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EcciNotificacionTest {

    @Test
    void testCrearNotificacionEmail() {
        Notificacion notificacion = EcciNotificacion.crearNotificacion(Canal.EMAIL);
        assertNotNull(notificacion, "La notificación no debería ser null");
        assertTrue(notificacion instanceof EmailNotificacion, "Debe ser de tipo EmailNotificacion");
    }

    @Test
    void testCrearNotificacionSMS() {
        Notificacion notificacion = EcciNotificacion.crearNotificacion(Canal.SMS);
        assertNotNull(notificacion);
        assertTrue(notificacion instanceof SMSNotificacion);
    }

    @Test
    void testCrearNotificacionMovil() {
        Notificacion notificacion = EcciNotificacion.crearNotificacion(Canal.MOVIL);
        assertNotNull(notificacion);
        assertTrue(notificacion instanceof MovilNotificaciones);
    }

    @Test
    void testCrearNotificacionNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            EcciNotificacion.crearNotificacion(null);
        });
    }

}
