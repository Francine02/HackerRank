import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plus(List<Integer> arr) {
        int positivos = 0;
        int negativos = 0;
        int zeros = 0;
        int tamanho = 0;

        for(int valor : arr) {
            tamanho ++; //Contabiliza para o tamanho do array
            if(valor < 0){
                negativos ++; //Contador com a quantidade de negativos encontrados
            } else if(valor == 0){
                zeros ++; //Contador com a quantidade de zeros encontrados
            } else if(valor > 0){
                positivos ++; //Contador com a quantidade de positivos encontrados
            }
        }
        //Transformando em valores decimais ao dividir o valor / tamanho
        double resultadoPositivos = (double) positivos / tamanho;
        double resultadoNegativos = (double) negativos / tamanho;
        double resultadoZeros = (double) zeros / tamanho;

        System.out.printf("%.6f\n", resultadoPositivos);
        System.out.printf("%.6f\n", resultadoNegativos);
        System.out.printf("%.6f\n", resultadoZeros);
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plus(arr);

        bufferedReader.close();
    }
}
