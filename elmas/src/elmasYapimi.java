import java.util.Scanner;

public class elmasYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 0; i--) {
            for (int k = (n-i); k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = (2*i)+1; j >=1; j--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
