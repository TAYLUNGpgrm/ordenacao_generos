package Composicao;

import java.util.HashSet;
import java.util.Set;

public class Banco {

    private Long codigo;
    private String nome;

    private Set<ContaCorrente> contaCorrenteList;

    private Set<ContaPoupanca> contaPoupancaList;

    public Banco() {

        this.contaCorrenteList = new HashSet<>();
        this.contaPoupancaList = new HashSet<>();
    }

    public void add(ContaPoupanca cp) {
        this.contaPoupancaList.add(cp);
    }


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
