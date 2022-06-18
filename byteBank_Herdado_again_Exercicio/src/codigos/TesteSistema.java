package codigos;

public class TesteSistema {

    public static void main(String[] args) {

        // Gerente g = new Gerente();
        // g.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        // si.autentica(g);

        Gerente referencia = new Gerente();
        referencia.setNome("Eulírico palhaço");
        referencia.setSenha(2222);
        si.autentica(referencia);

    }
}
