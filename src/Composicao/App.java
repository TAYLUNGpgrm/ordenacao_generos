package Composicao;

public class App {

    public static void main(String[] ars) {

        Banco banco = new Banco();

        banco.setCodigo(10L);
        banco.setNome("Banco Taylung");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10d);

        ContaPoupanca cp = new ContaPoupanca();

        cp.setBanco(banco);
        cp.setSald(10d);
    }
}
