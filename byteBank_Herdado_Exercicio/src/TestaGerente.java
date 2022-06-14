public class TestaGerente {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Luvercy Gomes");
        g1.setCPF("170.324.458-78");
        g1.setSalario(5000);
        g1.setSenha(052142);
        boolean autenticou = g1.autentica(052142);

        System.out.println(autenticou);

        System.out.println("Bonificação do Gerente " + g1.getNome() + " é de R$" + g1.getBonificacao() + ".");

    }
}