package codigos;

public class TesteGerente {

    public static void main(String[] args) {

        Gerente gerente_1 = new Gerente();

        gerente_1.setNome("Marco Frota");
        gerente_1.setCPF("777.942.180-20");
        gerente_1.setSalario(8500.0);
        gerente_1.setSenha(739560);

        boolean autenticou = gerente_1.autentica(739560);

        System.out.println(autenticou);
        System.out.println("Salário é de R$" + gerente_1.getSalario());
        System.out.println("Bonificação é de R$" + gerente_1.getBonificacao());

    }

}