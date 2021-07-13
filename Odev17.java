import java.util.Scanner;

public class Odev17 {
    public static void main(String[] args) {
        int k, toplam=0, sayac=0;
        double ortalama;
        Scanner scanner  = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        k = scanner.nextInt();
        for(int i =0; i<= k; i++){
            if(i%12 == 0){
                toplam+=i;
                sayac++;
            }}
        ortalama=toplam/sayac;
        System.out.println("Ortalamanız " + ortalama);
        }}


