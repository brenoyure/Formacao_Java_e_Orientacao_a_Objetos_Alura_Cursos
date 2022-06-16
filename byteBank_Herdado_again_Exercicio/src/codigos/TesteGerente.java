package codigos;

public class TesteGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Breno");
        g1.setCPF("057.254.566.20");
        g1.setSenha(052142);
        g1.setSalario(5000.0);

        boolean autenticou = g1.autentica(052142);

        System.out.println(autenticou);
        System.out.println(g1.getBonificacao());
        

    }

}