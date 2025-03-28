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

    @Test
    public void testConsignar(){
        Cuenta cuenta = new Cuenta(1000, 5);
        cuenta.consignar(500);
        assertEquals(1500, cuenta.saldo, 0.01);
        assertEquals(1, cuenta.numConsignaciones);
    }

    @Test
    public void testRetirar(){
        Cuenta cuenta = new Cuenta(1000, 5);
        cuenta.retirar(300);
        assertEquals(700, cuenta.saldo, 0.01);
        assertEquals(1, cuenta.numRetiros);
    }


    @Test
    public void testNoPoderRetirar(){
        Cuenta cuenta = new Cuenta(1000, 5);
        cuenta.retirar(1500);
        assertEquals(1000, cuenta.saldo, 0.01);
        assertEquals(0, cuenta.numRetiros);
    }
}
