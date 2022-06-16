package codigos;

public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando Método de Bonificação do Editor de Vídeo");
        return super.getBonificacao() + 100;
    }

}
