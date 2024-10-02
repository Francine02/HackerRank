import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String time(String s) {
        String fuso = s.substring(s.length() - 2); // Extrai "AM" ou "PM"
        String hora = s.substring(0, 2); // Extrai os dois primeiros caracteres como hora

        int result = 0;
        int horaInt = Integer.parseInt(hora); // Converte a string da hora para inteiro

        if(fuso.equals("AM")){
            if(horaInt == 12){
                result = 0; // 12 AM é 00 horas no formato 24 horas
            } else {
                result = horaInt;  // Horas AM de 1 a 11 permanecem iguais
            }
        } else {
            if (horaInt != 12) {
                result = horaInt + 12;  // Converte para o formato 24 horas
            } else {
                result = 12;
            }
        }
        // Formata a hora para garantir duas casas, e retorna a string final
        return String.format("%02d%s", result, s.substring(2, 8));
    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.time(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
