package desafio_dio_banco;

public class ContaPoupanca extends Contas {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Poupança ===");
        imprimirInfo();
    }
}
