import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteBliblioteca {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 222);
        ContaPoupanca cp = new ContaPoupanca(111, 444);

        System.out.println("Saldo da CC: R$" + cc.getSaldo());
        System.out.println("Saldo da CP: R$" + cp.getSaldo());

        


    }

}
