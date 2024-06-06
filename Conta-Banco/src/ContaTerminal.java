import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner 

        //Exibir as mensagens para o usuario

        //Obter pelo Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta.");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
    }
}
