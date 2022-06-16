package codigos;

public class TesteGerente {
    
    public static void main (String [] args) {

        Gerente g1 = new Gerente();

        g1.setNome("Marcos");
        g1.setCPF("170.774.234.32");
        g1.setSalario(5000.0);
        g1.setSenha(2222);
        
        System.out.println(g1.getNome());
        System.out.println(g1.getCPF());
        System.out.println(g1.getSalario());
        System.out.println(g1.getBonificacao());

        boolean autenticou = g1.autentica(2222);

        System.out.println(autenticou);


    }
    

}
