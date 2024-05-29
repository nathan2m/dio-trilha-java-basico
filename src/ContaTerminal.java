import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nNome Cliente:");
        final String nomeCliente = scanner.nextLine();

        System.out.println("\nAgência:");
        final String agencia = scanner.nextLine();

        System.out.println("\nNúmero da Conta:");
        final int numeroConta = scanner.nextInt();

        System.out.println("\nSaldo:");
        final double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
