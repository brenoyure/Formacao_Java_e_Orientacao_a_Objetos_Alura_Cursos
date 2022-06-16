package codigos;

public class EditorVideo extends Funcionario {

    public double getBonificacao() {
        System.out.println("Méotodo Bonificação do Editor de Vídeo");
        return super.getBonificacao() + 100;
    }

}