package codigos;

public class TesteSistema {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setNome("Random");
        g.setSenha(2222);

        Administrador admin1 = new Administrador();
        admin1.setNome("Felipe");
        admin1.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(admin1);
        si.autentica(cliente);

    }

}