import java.util.Scanner;

public class Odev24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number=scanner.nextInt();

        int m, n;

        for (m = 1; m <= number; m++) {

            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (m = number - 1; m > 0; m--) {

            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}


