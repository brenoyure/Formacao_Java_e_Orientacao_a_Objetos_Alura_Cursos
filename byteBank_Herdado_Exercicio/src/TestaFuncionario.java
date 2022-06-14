public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.setNome("Breno Yuri");
        f1.setCPF("057.947.16-20");
        f1.setSalario(2600);

        System.out.println(f1.getNome() + " " + f1.getCPF() + " " + f1.getSalario() + " " + f1.getBonificacao());

    }
}