package desafio_dio_banco;



public class ContaCorrente extends Contas{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Corrente ===");
        super.imprimirInfo();
    }
}
