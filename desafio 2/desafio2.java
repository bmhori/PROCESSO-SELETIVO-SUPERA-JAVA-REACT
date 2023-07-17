import java.util.Locale;
import java.util.Scanner;

public class desafio2 {
    private static final double[] NOTAS = { 100.0, 50.0, 20.0, 10.0, 5.0, 2.0 };
    private static final double[] MOEDAS = { 1.0, 0.50, 0.25, 0.10, 0.05, 0.01 };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Insira o valor: ");
        double valor = scanner.nextDouble() * 100 + 0.05;

        System.out.println("NOTAS:");
        for (double nota : NOTAS) {
            int numNota = (int) (valor / (nota * 100));
            valor %= nota * 100;
            System.out.printf("%d nota(s) de R$ %.2f%n", numNota, nota);
        }

        System.out.println("MOEDAS:");
        for (double moeda : MOEDAS) {
            int numMoeda = (int) (valor / (moeda * 100));
            valor %= moeda * 100;
            System.out.printf("%d moeda(s) de R$ %.2f%n", numMoeda, moeda);
        }

        scanner.close();
    }
}
