import  java.util.Scanner;

public class odev1 {
    public static void main(String[] args) {

        int mat, muzik, fizik, kimya, turkce, tarih;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = scanner.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = scanner.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = scanner.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = scanner.nextInt();

        int toplam = ( mat +fizik+ kimya + turkce + muzik + tarih );
        double sonuc = toplam/6.0;
        System.out.println("Ortalamanız :" +sonuc);
        if(sonuc>60){
            System.out.print("Sınıfı geçti");
        }
        else
        {System.out.print("Sınıfta Kaldı");}
    }
}
