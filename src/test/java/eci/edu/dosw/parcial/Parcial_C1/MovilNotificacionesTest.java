package eci.edu.dosw.parcial.Parcial_C1;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MovilNotificacionesTest {

    @Test
    void testSendMovil() {
        MensajeNot mensaje = new MensajeNot("Laura", "Alerta", "Entrega retrasada", 7);
        MovilNotificaciones movil = new MovilNotificaciones();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        movil.send(mensaje);

        String result = output.toString();
        assertTrue(result.contains("Push"), "La salida debe contener la palabra 'Push'");
        assertTrue(result.contains("Laura"), "La salida debe contener el nombre del usuario");
        assertTrue(result.contains("Entrega retrasada"), "La salida debe contener el cuerpo del mensaje");
        assertTrue(result.contains("7"), "La salida debe contener el nivel de criticidad 7");
    }
}

