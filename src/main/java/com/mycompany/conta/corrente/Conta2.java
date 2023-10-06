package com.mycompany.conta.corrente;


public class Conta2 {
    public double dep, saq, saldo, op;
    
    public double txop(){
        saldo = dep - saq;
        op = saldo - (0.005 * saq);
        return op;
    }
}
