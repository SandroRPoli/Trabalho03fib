package trabalhostrategy;

import trabalhostrategy.Interface.ICalcular;

public class TrabalhoStrategy {

    private static double realizarCalculo(ICalcular obj) {
        return obj.calcular();
    }

    public static void main(String[] args) {

        //Todos os funcionários agora são pessoas normais. O que define agora são os calculos
        Pessoa presidente = new Pessoa("Sandro", "Presidente", 15000.0);

        Pessoa diretorComercial = new Pessoa("Rubens", "Diretor Comercial", 5500.0, 20, 12300.0);
        Pessoa func1 = new Pessoa("Marcos", "Vendedor", 3000.0, 8, 16400.0);
        Pessoa func2 = new Pessoa("Murilo", "Vendedor", 2500.0, 10, 8900.0);

        Pessoa diretorProducao = new Pessoa("Jaimes", "Diretor Produção", 4000.0);
        Pessoa func3 = new Pessoa("Matheus", "Desenvolvedor", 2500.0);
        Pessoa func4 = new Pessoa("Marcelo", "Desenvolvedor", 1500.0);
        Pessoa func5 = new Pessoa("Ana", "Desenvolvedora", 2000.0);

        //Invoca a classe para o calculo de Presidente
        CalcularPresidente calcPres = new CalcularPresidente();

        //defino a pessoa para o calculo presidente
        calcPres.incluiFuncionario(presidente);
        
        System.out.println("Nome: " + calcPres.getPessoa().getNome()
                + ", Cargo: " + calcPres.getPessoa().getCargo()
                + ", Salario: " + realizarCalculo(calcPres));

        //Invoca a classe para o calculo de Gerente
        CalcularGerente calcGer = new CalcularGerente();

        //defino a pessoa para o calculo do gerente comercial
        calcGer.incluiFuncionario(diretorComercial);

        System.out.println("\t" + "Nome: " + calcGer.getPessoa().getNome()
                + ", Cargo: " + calcGer.getPessoa().getCargo()
                + ", Salario: " + realizarCalculo(calcGer));

        //Invoca a classe para o calculo de Funcionario
        CalcularFuncionario calcFunc = new CalcularFuncionario();

        //defino a pessoa para o calculo do funcionario
        calcFunc.incluiFuncionario(func1);

        System.out.println("\t\t" + "Nome: " + calcFunc.getPessoa().getNome()
                + ", Cargo: " + calcFunc.getPessoa().getCargo()
                + ", Salario: " + realizarCalculo(calcFunc));

        //defino a pessoa para o calculo do funcionario
        calcFunc.incluiFuncionario(func2);

        System.out.println("\t\t" + "Nome: " + calcFunc.getPessoa().getNome()
                + ", Cargo: " + calcFunc.getPessoa().getCargo()
                + ", Salario: " + realizarCalculo(calcFunc));

        //defino a pessoa para o calculo do gerente produção
        calcGer.incluiFuncionario(diretorProducao);

        System.out.println("\t" + "Nome: " + calcGer.getPessoa().getNome()
                + ", Cargo: " + calcGer.getPessoa().getCargo()
                + ", Salario: " + realizarCalculo(calcGer));

        calcFunc.incluiFuncionario(func3);

        System.out.println("\t\t" + "Nome: " + calcFunc.getPessoa().getNome()
                + ", Cargo: " + calcFunc.getPessoa().getCargo()
                + ", Salario: " + realizarCalculo(calcFunc));

        calcFunc.incluiFuncionario(func4);

        System.out.println("\t\t" + "Nome: " + calcFunc.getPessoa().getNome()
                + ", Cargo: " + calcFunc.getPessoa().getCargo()
                + ", Salario: " + realizarCalculo(calcFunc));

        calcFunc.incluiFuncionario(func5);

        System.out.println("\t\t" + "Nome: " + calcFunc.getPessoa().getNome()
                + ", Cargo: " + calcFunc.getPessoa().getCargo()
                + ", Salario: " + realizarCalculo(calcFunc));

    }
}
