package trabalhostrategy;

import trabalhostrategy.Interface.ICalcular;

public class CalcularPresidente implements ICalcular {

    Pessoa pessoa;

    public void incluiFuncionario(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public double calcular() {

        return this.pessoa.getSalario() * (1 - 0.02);

    }

    public Pessoa getPessoa() {

        return pessoa;
    }
}
