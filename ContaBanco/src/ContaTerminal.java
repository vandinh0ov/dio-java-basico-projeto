import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;
        
        System.out.println();
        System.out.println("#### Seja Bem-vindo ao seu banco! ####");
        System.out.println("Abaixo pediremos algumas informações.");
        System.out.println();

        System.out.println(" Informe o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println(" Informe o número da conta: ");
        numero = sc.nextInt();

        System.out.println(" Informe a agência da conta: ");
        agencia = sc.next();
        
        System.out.println(" Informe o saldo da conta: ");
        saldo = sc.nextDouble();        
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
