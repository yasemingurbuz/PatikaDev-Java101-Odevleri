import java.util.Scanner;

public class Odev26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok;
        System.out.print("Birinci Sayıyı giriniz : ");
        n1 = scan.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = scan.nextInt();
        int i = n1;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                break;
            }
            i--;
        }
        System.out.println("Ebob(" + n1 + "," + n2 + ")=" + ebob);
        ekok = (n1 * n2) / ebob;
        System.out.println("Ekok(" + n1 + "," + n2 + ")=" + ekok);
    }
}

