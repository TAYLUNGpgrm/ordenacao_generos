package Composicao;

public class ContaCorrente {

    private Banco banco;

    private Double saldo;

    private Double checkSpecial;

    public Double saldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double checkSpecial() {
        return checkSpecial;
    }

    public void setCheckSpecial(Double CheckSpecial) {
        this.checkSpecial = checkSpecial;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
