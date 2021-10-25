package com.company;

public class AssalariadoComissionado extends Assalariado{

    private double comissao;
    private double salario;
    private boolean bonus = false;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public double calculaPagamento(boolean bonus) {
        double fixo = super.calculaPagamento();
        if (this.bonus)
            return fixo + this.comissao * 0.1;
        return fixo + this.comissao;
    }
}
