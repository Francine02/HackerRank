import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        for(char c : s.toCharArray()){ //Frequencia de caracter
            frequency.put(c, frequency.getOrDefault(c, 0) +1);
        }

        Map<Integer, Integer> count = new HashMap<>();
        for(int b : frequency.values()){ //Frequencia de caracter
            count.put(b, count.getOrDefault(b, 0) +1);
        }

        if (count.size() == 1) {
            return "YES";
        } 
        if (count.size() > 2) {
            return "NO";
        }

        List<Integer> counts = new ArrayList<>(count.keySet());
        int count1 = counts.get(0);
        int count2 = counts.get(1);
        int freqCount1 = count.get(count1);
        int freqCount2 = count.get(count2);

        // Verificar as condições de validade
        if ((freqCount1 == 1 && (count1 - 1 == count2 || count1 == 1)) ||
            (freqCount2 == 1 && (count2 - 1 == count1 || count2 == 1))) {
            return "YES";
        }

        return "NO";
    }

}

public class SherlockValidString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
