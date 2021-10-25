package com.company;

public abstract class Assalariado implements Funcionario {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calculaPagamento() {
        return getSalario();
    }
}
