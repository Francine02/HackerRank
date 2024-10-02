import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        int totalSum = 0;
        int miniSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for(int value : arr){ // Loop para calcular a soma total e encontrar o menor e o maior número
            totalSum += value; // Acumula a soma

            if(value < miniSum){
                miniSum = value; // Atualiza o menor número
            }
            if(value > maxSum){
                maxSum = value; // Atualiza o maior número
            }
        }
        // Calculamos a soma mínima e máxima
        int resultMin = totalSum - maxSum;// Soma mínima
        int resultMax = totalSum - miniSum; // Soma máxima

        System.out.println(resultMin + " " + resultMax);
    }

}

public class MaxMinSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
