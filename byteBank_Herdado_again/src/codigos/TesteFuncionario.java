package codigos;

public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario breno = new Funcionario();

        breno.setNome("Breno Yuri");
        breno.setCPF("057.947.163.20");
        breno.setSalario(2600.0);

        System.out.println(breno.getNome());
        System.out.println(breno.getBonificacao());

    }

}