package eci.edu.dosw.parcial.Parcial_C1;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SMSNotificacionTest {

    @Test
    void testSendSMS() {
        MensajeNot mensaje = new MensajeNot("Carlos", "Aviso", "Revisa tu buzón", 3);
        SMSNotificacion sms = new SMSNotificacion();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        sms.send(mensaje);

        String result = output.toString();
        assertTrue(result.contains("MSM"), "Debe contener la palabra 'MSM'");
        assertTrue(result.contains("Carlos"), "Debe contener el nombre del usuario");
        assertTrue(result.contains("Revisa tu buzón"), "Debe contener el cuerpo del mensaje");
        assertTrue(result.contains("3"), "Debe contener el nivel de criticidad 3");
    }
}
