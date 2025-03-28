package dev.alberto;

public class Cuenta {

    protected float saldo;
    protected  float tasaAnual;
    protected int numConsignaciones;
    protected int numRetiros;
    protected float comisionMensual;

    public Cuenta(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        this.numConsignaciones = 0;
        this.numRetiros = 0;
        this.comisionMensual = 0;

    };

    public void consignar(float cantidad){
        saldo += cantidad;
        numConsignaciones++;
    }

    public void retirar(float cantidad){
        if (cantidad<= saldo){
            saldo -= cantidad;
            numRetiros++;
        }
        else {
            System.out.println("No tienes dinero suficiente.");
        }
    }
}
