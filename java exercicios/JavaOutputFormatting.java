import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstCollumns;
        int secondColumns;

        System.out.println("================================");


        for(int i=0; i < 3; i++){
            firstCollumns = sc.next();
            secondColumns = sc.nextInt();

            System.out.printf("%-15s%03d%n", firstCollumns, secondColumns);
        }

        System.out.println("================================");
        sc.close();
    } 
}