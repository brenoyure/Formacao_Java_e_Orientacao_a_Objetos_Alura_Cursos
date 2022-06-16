package codigos;

public class TesteFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Breno Yuri");
        funcionario1.setCPF("152.485.324.23");
        funcionario1.setSalario(1000.0);

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getCPF());
        System.out.println(funcionario1.getSalario());
        System.out.println("Bonificação: R$" + funcionario1.getBonificacao());

    }

}
