package eci.edu.dosw.parcial.Parcial_C1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlujoNotificacionTest {

    @Test
    void testFlujoNotificacionCompleto() {
        MensajeNot mensaje = new MensajeNot("Pedro", "Entrega", "Tu pedido salió", 8);
        PreCliente cliente = new PreCliente(Canal.SMS, 8);

        Notificacion notificacion = EcciNotificacion.crearNotificacion(cliente.getCanalElegido());
        assertNotNull(notificacion);

        notificacion.send(mensaje);
    }
}

