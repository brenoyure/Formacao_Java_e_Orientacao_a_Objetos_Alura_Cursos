package codigos;

public class TesteReferencias {

    public static void main(String[] args) {

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2000.0);

        Designer d = new Designer();
        d.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());

    }

}
