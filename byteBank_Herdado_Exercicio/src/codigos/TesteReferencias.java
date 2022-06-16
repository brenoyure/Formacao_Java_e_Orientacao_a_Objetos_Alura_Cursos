package codigos;

public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000);

        Funcionario f1 = new Funcionario();
        f1.setNome("Breno");
        f1.setSalario(2000);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500);

        Designer d = new Designer();
        d.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());

    }
}
