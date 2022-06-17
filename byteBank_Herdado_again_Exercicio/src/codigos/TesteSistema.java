package codigos;

public class TesteSistema {

    public static void main(String[] args) {

        // Gerente g = new Gerente();
        // g.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        // si.autentica(g);

        Autenticavel referencia = new Gerente();
        referencia.setSenha(2222);
        si.autentica(referencia);

    }
}
