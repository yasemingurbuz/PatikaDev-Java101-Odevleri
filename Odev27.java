import java.util.Scanner;

public class Odev27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n, max = 0, min = 99999, sayi;
        System.out.print("Kaç Tane Sayı gireceksiniz : ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
        System.out.print(i + " . Sayıyı Giriniz : ");
        sayi = scanner.nextInt();
        if( sayi > max) max = sayi;
        if( sayi < min) min = sayi;
        }
        System.out.println("En küçük sayı : " + min + "\nEn büyük sayı : " + max);

}}


