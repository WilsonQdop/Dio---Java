package desafio_dio_banco;

public class main {
    public static void main(String[] args) {
        Cliente nome = new Cliente();
        nome.setNome("Wilson");

        Contas cc = new ContaCorrente(nome);
        cc.depositar(100);


        Contas cp = new ContaPoupanca(nome);
        cc.transferir(40, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
