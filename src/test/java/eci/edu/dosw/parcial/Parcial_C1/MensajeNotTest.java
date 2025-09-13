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
    @Test
    void testMensajeNotValores() {
        MensajeNot mensaje = new MensajeNot("Laura", "Aviso", "Entrega programada", 3);

        assertEquals("Laura", mensaje.getUsuario());
        assertEquals("Aviso", mensaje.getAsunto());
        assertEquals("Entrega programada", mensaje.getCuerpo());
        assertEquals(3, mensaje.getCritico());
    }

    @Test
    void testMensajeNotCriticidadCero() {
        MensajeNot mensaje = new MensajeNot("Pedro", "Recordatorio", "Verifica tu bandeja", 0);

        assertEquals("Pedro", mensaje.getUsuario());
        assertEquals("Recordatorio", mensaje.getAsunto());
        assertEquals("Verifica tu bandeja", mensaje.getCuerpo());
        assertEquals(0, mensaje.getCritico());
    }

}
