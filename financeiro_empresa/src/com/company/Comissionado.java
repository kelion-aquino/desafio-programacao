package com.company;

public class Comissionado implements Funcionario {

    private double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calculaPagamento() {
        return this.comissao;
    }
}
