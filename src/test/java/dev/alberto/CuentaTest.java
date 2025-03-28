package dev.alberto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CuentaTest {

    @Test
    public void testContruptores() {
        Cuenta cuenta = new Cuenta(1000,5);

        assertEquals(1000, cuenta.saldo, 0.01);
        assertEquals(5, cuenta.tasaAnual, 0.01);
        assertEquals(0, cuenta.numConsignaciones);
        assertEquals(0, cuenta.numRetiros);
        assertEquals(0, cuenta.comisionMensual, 0.01);
    }
}
