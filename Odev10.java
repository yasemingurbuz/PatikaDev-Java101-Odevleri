import java.util.Scanner;

public class Odev10 {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;
        int toplam=0, dersler =0;
        double ortalama;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat=scanner.nextInt();
        if(0<mat && mat<100)
        {dersler+= 1; toplam+=mat;}

        System.out.print("Türkçe notunuz : ");
        turkce=scanner.nextInt();
        if(0<turkce && turkce<100)
        {dersler+= 1; toplam+= turkce;}

        System.out.print("Fizik notunuz : ");
        fizik=scanner.nextInt();
        if(0<fizik && fizik<100)
        {dersler+= 1; toplam+=fizik;}

        System.out.print("Kimya notunuz : ");
        kimya=scanner.nextInt();
        if(0<kimya && kimya<100)
        {dersler+= 1; toplam+=kimya;}

        System.out.print("Müzik notunuz : ");
        muzik=scanner.nextInt();
        if(0<muzik && muzik<100)
        {dersler+= 1; toplam+=muzik;}

        ortalama = toplam / dersler;

        if(ortalama <= 55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere! ");
            }else{
                System.out.println("Tebrikler, sınıf geçtiniz!");
            }
            System.out.println("Ortalamanız : " + ortalama);
        }

        }

