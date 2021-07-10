import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        int a,b;
        double c,u, Alan;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz : ");
        a = scanner.nextInt();
        System.out.print("İkinci kenarı giriniz : ");
        b= scanner.nextInt();
        System.out.print("Üçüncü kenarı giriniz : ");
        c= scanner.nextInt();

        u = (a + b + c)/2;
        Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı : " + Alan);
    }
}
