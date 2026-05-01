package br.com.alefd.Abstratas;

/**
 * @author alefd.utran.eves
 */
public class Comissionado extends Empregado{

    private Double totalVendas;

    private Double totalComissao;

    @Override
    public Double vencimento() {
        return totalVendas*totalComissao;
    }

    public Double getTotalComissao() {
        return totalComissao;
    }

    public void setTotalComissao(Double totalComissao) {
        this.totalComissao = totalComissao;
    }

    public Double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(Double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
