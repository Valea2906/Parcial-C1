package eci.edu.dosw.parcial.Parcial_C1;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class EmailNotificacionTest {

    @Test
    void testSendEmail() {
        MensajeNot mensaje = new MensajeNot("Valeria", "Entrega", "Tu pedido llega hoy", 5);
        EmailNotificacion email = new EmailNotificacion();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        email.send(mensaje);

        String result = output.toString();
        assertTrue(result.contains("Email"));
        assertTrue(result.contains("Valeria"));
        assertTrue(result.contains("Entrega"));
        assertTrue(result.contains("Tu pedido llega hoy"));
        assertTrue(result.contains("5"));
    }
}
