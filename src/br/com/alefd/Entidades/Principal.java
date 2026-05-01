package br.com.alefd.Entidades;

/**
 * @author alefd.utran.eves
 */
public class Principal {
    public static void main(String[] args) {

        PessoaF pf = new PessoaF();
        pf.setNome("Alef");
        pf.setCpf("123.456.789-10");
        PessoaJ pj = new PessoaJ();
        pj.setNome("TAYLUNG - LTDA");
        pj.setCnpj("12.345.678/0001-00");

        System.out.println("Nome da pessoa Física: " + pf.getNome() + "\nNome da Empresa: " + pj.getNome() + "\nCPF: " + pf.getCpf() + "\nCNPJ: " + pj.getCnpj());
    }
}
