import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner leitura = new Scanner(System.in);


        System.out.printf("Por favor, digite o número da Agência ! ");
        agencia = leitura.nextLine();

        System.out.printf("Por favor, digite o número da Conta ! ");
        numeroConta = leitura.nextInt();
        leitura.nextLine();

        System.out.printf("Por favor, digite o nome do cliente ! ");
        nomeCliente = leitura.nextLine();

        System.out.printf("Por favor, digite o saldo da conta ! ");
        saldo = leitura.nextDouble();


        System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s , conta %d " +
                "e seu saldo %f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);

//        System.out.println(STR."Olá \{nomeCliente} , obrigado por criar uma conta em nosso banco, sua agência é \{agencia}, conta \{numeroConta} e seu saldo \{saldo} já está disponível para saque");
    }
}