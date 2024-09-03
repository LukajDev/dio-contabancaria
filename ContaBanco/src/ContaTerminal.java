import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o nome da agência: ");
        String nomeAgencia = sc.nextLine();

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = sc.nextLine();

        double saldo = 15354.23;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
