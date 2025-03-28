package dev.alberto;

public class CuentaCorriente extends Cuenta{

    private float sobregiro;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.sobregiro = 0;
    }

    public float getSobregiro() {
        return sobregiro;
    }

    @Override
    public void retirar(float cantidad){
        saldo -= cantidad;
        if (saldo < 0){
            sobregiro += Math.abs(saldo);
            saldo = 0;
        }
        numRetiros++;
    }




    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0 ){
            float cubrirSobregiro = Math.min(cantidad, sobregiro);
            sobregiro -= cubrirSobregiro;
            cantidad -= cubrirSobregiro;
        }
        super.consignar(cantidad);
}



    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }
}
