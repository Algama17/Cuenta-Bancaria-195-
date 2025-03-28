package dev.alberto;

public class CuentaAhorros extends Cuenta {
    private boolean activa;
    public CuentaAhorros(float saldo, float tasaAnual){
        super(saldo, tasaAnual);
        activa = saldo >= 10000;
    } 

    @Override
    public void consignar(float cantidad){
        if(activa){
            super.consignar(cantidad);
        }
        else{
            System.out.println("La cuenta esta inactiva, no se puede consignar");
        }
    }


    @Override
    public void retirar(float cantidad){
        if (activa){
            super.retirar(cantidad);
        }
        else{
            System.out.println("La cuenta esta inactiva, no puedes retirar dinero");
        }
    }    
}
