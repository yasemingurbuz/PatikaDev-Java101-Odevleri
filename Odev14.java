import java.util.Scanner;

public class Odev14 {
    public static void main(String[] args) {
        int km,yas,tip;
        double kmFiyat = 0.1, biletFiyat;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz :");
        km = scanner.nextInt();
        System.out.println("Yaşınızı giriniz :");
        yas = scanner.nextInt();
        System.out.print("Yolculuk tipi: (1=>Tek Yön, 2=>Gidiş Dönüş): ");
        tip = scanner.nextInt();

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            biletFiyat = kmFiyat * km;
            if ((tip==1) && yas < 12){
                biletFiyat = biletFiyat*0.5;
            }
            else if ((tip==2) && yas < 12){
                biletFiyat = biletFiyat*0.5;
                biletFiyat = 2*(biletFiyat*0.8);
            }
            else if ((tip==1) && (yas>12 && yas <= 24)){
                biletFiyat = biletFiyat*0.9;
            }
            else if ((tip==2) && (yas>12 && yas <= 24)){
                biletFiyat = biletFiyat*0.9;
                biletFiyat = 2*(biletFiyat*0.8);
            }
            else if(tip==1 && yas>65){
                biletFiyat = biletFiyat*0.7;
            }
            else if (tip==2 && yas>65){
                biletFiyat = biletFiyat*0.7;
                biletFiyat = 2*(biletFiyat*0.8);
            }
            System.out.println("Toplam Tutar = " + biletFiyat);

        } else{
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}