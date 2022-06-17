package codigos;

public class TesteContas {

    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(001, 2222);
        ContaPoupanca cp1 = new ContaPoupanca(001, 4444);

        cc1.deposita(100);
        cp1.deposita(100);

        System.out.println("Saldo Conta Corrente R$" + cc1.getSaldo());
        System.out.println("Saldo Conta Poupana R$" + cp1.getSaldo());

        System.out.println(" ----------- Transferência de 10 Reais ------------");
        cc1.transfere(cp1, 10);

        System.out.println("Saldo Conta Corrente R$" + cc1.getSaldo());
        System.out.println("Saldo Conta Poupana R$" + cp1.getSaldo());

    }

}