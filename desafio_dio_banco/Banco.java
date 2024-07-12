package desafio_dio_banco;

import java.util.List;

public class Banco {

    private String nome;
    private List<Contas> contas;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contas> getContas() {
        return contas;
    }

    public void setContas(List<Contas> contas) {
        this.contas = contas;
    }
    
}
