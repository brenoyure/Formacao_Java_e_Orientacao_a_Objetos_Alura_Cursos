package codigos;

public class TesteReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        EditorVideo e = new EditorVideo();
        e.setNome("Marley");
        e.setSalario(2500.0);

        Designer d = new Designer();
        d.setNome("Washington");
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(e);
        controle.registra(d);

        System.out.println(controle.getSoma());

    }

}
