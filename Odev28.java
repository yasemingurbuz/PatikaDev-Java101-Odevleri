import java.util.Scanner;

public class Odev28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n= scanner.nextInt();
        int total = 0;
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0) {
                total += i;
            }
        }
        if(n == total) {
            System.out.println(n + " mükemmel sayidir.");
        }
        else {
            System.out.println(n + " Mükemmel sayı degildir.");
        }
    }
}
