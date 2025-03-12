import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class ContaTerminal
 {
    public static void main(String[] args) throws Exception {
        int numero;
        double saldo;
        String agencia, nomeCliente;

        Scanner scn = new Scanner(System.in);
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.00");

        saldo = 0 + random.nextDouble() * (5000 - 0);

        System.out.println("Por favor, digite seu nome");
        nomeCliente = scn.nextLine();
        
        System.out.println("Por favor, digite sua agência");
        agencia = scn.nextLine();

        System.out.println("Por favor, digite o número de sua conta");
        numero = scn.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência " + agencia + ", conta " + numero + " e seu saldo R$" + df.format(saldo) + " já está disponível para saque.");
    }
}
