package com.company;

public class PorHora extends  Assalariado{

    private int horaExtra;
    private double valorHora;
    private double salario;

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double getSalario() {
        return super.getSalario();
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    @Override
    public double calculaPagamento() {
        double fixo = super.calculaPagamento();
        return fixo + horaExtra * valorHora;
    }
}
