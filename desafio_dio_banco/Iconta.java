package desafio_dio_banco;

public interface Iconta {

     void sacar(double valor);

     void depositar(double valor);

     void transferir(double valor, Contas contaDestino);

     void imprimirExtrato();
}
