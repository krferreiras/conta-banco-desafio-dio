import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor informe o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("Bem-vindo(a) "+nome+"!");
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();
        System.out.print("Por favor, digite o número da Conta Bancária: ");
        int conta = sc.nextInt();
        System.out.print("Por favor, digite o saldo do cliente: R$ ");
        double saldo = sc.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco,\nsua agência é" +
                " %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.", nome, agencia, conta, saldo);

        sc.close();
    }
}
