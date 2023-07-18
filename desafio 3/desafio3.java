import java.util.HashMap;

public class desafio3 {

    // Função para retornar a contagem de todos os pares válidos
     
    static int countPairs(int arr[]) {

        // Para armazenar as frequências  de (arr[i] - i)
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = arr[i] - i;
            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }

        // Para armazenar a contagem necessária
        int res = 0;
        for (int x : map.values()) {
            res += x * (x - 1) / 2;
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6  };
        System.out.println(countPairs(arr));
    }
}
