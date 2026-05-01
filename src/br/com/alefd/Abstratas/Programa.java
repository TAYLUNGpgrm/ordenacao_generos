package br.com.alefd.Abstratas;

public class Programa {

    public static void main(String[] args){
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Alef");
        empregado.setSobrenome("Dutra");
        empregado.setSalario(100d);
        System.out.println(empregado.getNome() + " Tem um salario de: R$" + empregado.vencimento() + " Reais");

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Alef2");
        comissionado.setSobrenome("Dutra2");
        comissionado.setTotalVendas(1000d);
        comissionado.setTotalComissao(0.1d);
        System.out.println(comissionado.getNome() + " Tem um salario (comissionado) de: R$" + comissionado.vencimento() + " Reais");
    }
}
