package codigos;

public class Designer extends Funcionario {

    double getBonificacao() {
        System.out.println("Método de Bonificação do Designer");
        return super.getBonificacao() + 200;

    }

}