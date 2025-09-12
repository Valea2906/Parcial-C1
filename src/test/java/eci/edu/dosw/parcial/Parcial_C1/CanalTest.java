package eci.edu.dosw.parcial.Parcial_C1;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;



class CanalTest {

    @Test
    void testEnumValues() {
        Canal[] valores = Canal.values();
        assertEquals(3, valores.length, "El enum Canal debe tener 3 valores");
        assertArrayEquals(new Canal[]{Canal.EMAIL, Canal.SMS, Canal.MOVIL}, valores);
    }

    @Test
    void testValueOf() {
        assertEquals(Canal.EMAIL, Canal.valueOf("EMAIL"));
        assertEquals(Canal.SMS, Canal.valueOf("SMS"));
        assertEquals(Canal.MOVIL, Canal.valueOf("MOVIL"));
    }

    @Test
    void testInvalidValueOfThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Canal.valueOf("WHATSAPP"));
    }
}
