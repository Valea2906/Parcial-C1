package eci.edu.dosw.parcial.Parcial_C1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class MensajeNotTest {

    @Test
    void testMensajeCritico() {
        MensajeNot mensaje = new MensajeNot("Valeria", "Entrega", "Tu pedido llega hoy", 8);

        assertEquals("Valeria", mensaje.getUsuario());
        assertEquals("Entrega", mensaje.getAsunto());
        assertEquals("Tu pedido llega hoy", mensaje.getCuerpo());
        assertEquals(8, mensaje.getCritico(), "El nivel de criticidad debería ser 8");
    }

    @Test
    void testMensajeNoCritico() {
        MensajeNot mensaje = new MensajeNot("Carlos", "Recordatorio", "Revisa tu buzón", 2);

        assertEquals("Carlos", mensaje.getUsuario());
        assertEquals("Recordatorio", mensaje.getAsunto());
        assertEquals("Revisa tu buzón", mensaje.getCuerpo());
        assertEquals(2, mensaje.getCritico(), "El nivel de criticidad debería ser 2");
    }
}
