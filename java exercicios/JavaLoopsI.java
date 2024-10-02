import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class JavaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        int mult;

        for(int i=1; i<=10; i++){
            mult = i * N;
            System.out.println(N + " x " + i + " = " + mult);
        }
    }
}
