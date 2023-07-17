import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas de entrada: ");
        int n = scanner.nextInt();

        List<Integer> valores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            valores.add(valor);
        }

        ordenarParesImpares(valores);
    }

    public static void ordenarParesImpares(List<Integer> valores) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int valor : valores) {
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        for (int valor : pares) {
            System.out.println(valor);
        }

        for (int valor : impares) {
            System.out.println(valor);
        }
    }
}
