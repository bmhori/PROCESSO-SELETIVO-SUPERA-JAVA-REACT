import java.util.Scanner;

public class desafio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de frases: ");
        int N = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        for (int i = 0; i < N; i++) {
            System.out.print("Insira a frase: ");
            String frase = sc.nextLine();

            int meio = frase.length() / 2;
            String parte1 = new StringBuilder(frase.substring(0, meio)).reverse().toString();
            String parte2 = new StringBuilder(frase.substring(meio)).reverse().toString();
            System.out.println(parte1 + parte2);
        }

        sc.close();
    }
}
