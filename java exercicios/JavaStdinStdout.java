import java.util.Scanner;

public class JavaStdinStdout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        Double b = sc.nextDouble();
        sc.nextLine(); 
        String a = sc.nextLine();

        System.out.println("String: " + a + "\nDouble: " + b + "\nInt: " + c);
        sc.close();
    }
}