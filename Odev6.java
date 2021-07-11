import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        int kilo;
        double boy, VKİ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextInt();

        VKİ = (kilo) / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " +VKİ);

    }
}
