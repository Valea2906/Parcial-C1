package eci.edu.dosw.parcial.Parcial_C1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreClienteTest {

    @Test
    void testConstructorAndGetters() {
        Canal canal = Canal.SMS;
        int criticidad = 5;

        PreCliente preCliente = new PreCliente(canal, criticidad);

        assertEquals(canal, preCliente.getCanalElegido(), "El canal elegido no coincide");

        assertEquals(criticidad, preCliente.getCritico(), "La criticidad no coincide");
    }

    @Test
    void testDifferentValues() {
        Canal canal = Canal.EMAIL;
        int criticidad = 9;

        PreCliente preCliente = new PreCliente(canal, criticidad);

        assertEquals(Canal.EMAIL, preCliente.getCanalElegido());
        assertEquals(9, preCliente.getCritico());
    }
    @Test
    void testPreClienteValores() {
        PreCliente cliente = new PreCliente(Canal.SMS, 7);

        assertEquals(Canal.SMS, cliente.getCanalElegido());
        assertEquals(7, cliente.getCritico());
    }

    @Test
    void testPreClienteEmailCritico() {
        PreCliente cliente = new PreCliente(Canal.EMAIL, 1);

        assertEquals(Canal.EMAIL, cliente.getCanalElegido());
        assertEquals(1, cliente.getCritico());
    }

}
