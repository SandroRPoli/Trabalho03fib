package trabalhostrategy;

public class Pessoa {

    private String nome;
    private String cargo;
    private int comissao;
    private Double totVendas;
    private Double salario;

    // sem comissão
    public Pessoa(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Com comissão
    public Pessoa(String nome, String cargo, Double salario, int comissao, Double totVendas) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.comissao = comissao;
        this.totVendas = totVendas;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getComissao() {
        return comissao;
    }

    public Double getTotVendas() {
        return totVendas;
    }

    public Double getSalario() {
        return salario;
    }
}