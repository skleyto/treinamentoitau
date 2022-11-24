package br.com.letscode.turmaitau.projetoFinalModulo1;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{

    BigDecimal novoSaldo =  new BigDecimal("0");

    public ContaPoupanca(String numero, Pessoa pessoa, BigDecimal saldo) {
        super(numero, pessoa, saldo);
    }

    public void depositar(BigDecimal valor) {
        //double novoSaldo = getSaldo() + valor + (valor*0.01);
        novoSaldo = (valor.multiply(new BigDecimal("0.01"))).add(valor).add(getSaldo());
        setSaldo(novoSaldo);
        System.out.println(STRINGSALDO + getSaldo());
    }
}
