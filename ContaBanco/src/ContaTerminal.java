import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        int numero = Integer.parseInt(input.nextLine());

        System.out.println("Por favor, digite a agência: ");
        String agencia = input.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        BigDecimal saldo = input.nextBigDecimal();
    }
}