package desafio_dio_banco;

public abstract class Contas implements Iconta{

    private static final int AGENCIA_PADRAO = 1;
    private static  int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    private Cliente cliente;

    public Contas(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Contas contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirInfo() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d ", this.agencia));
        System.out.println(String.format("Número da conta: %d ", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f ", this.saldo));

    }

    public int getAgencia() {
        return this.agencia;
    }
    public int getNumeroConta() {
        return this.numeroConta;
    }
    public double getSaldo() {
        return this.saldo;
    }


}
