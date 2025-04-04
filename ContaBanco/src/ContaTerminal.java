import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        //É usado uma conversão de tipo de variável para consumir a quebra de linha que o nextInt não faz
        int numero = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, digite a agência: ");
        String agencia = input.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        BigDecimal saldo = new BigDecimal(input.nextLine());

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque");
        input.close();
    }
}