package com.mycompany.conta.corrente;

import java.util.Scanner;
public class ContaCorrente {

    public static void main(String[] args) {
       Conta2 c = new Conta2();
       
        Scanner leia1 = new Scanner(System.in);
        System.out.println("Digite o valor de deposito: ");
        c.dep = leia1.nextDouble();
       
                
        Scanner leia2 = new Scanner(System.in);
        System.out.println("Digite o valor de saque: ");
        c.saq = leia2.nextDouble();
        
        System.out.println("Saldo apos o saque:" +c.txop());
    }
}
