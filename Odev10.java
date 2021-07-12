import java.util.Scanner;

public class Odev10 {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik notunuz : ");
        mat=scanner.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkce=scanner.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik=scanner.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya=scanner.nextInt();
        System.out.print("Müzik notunuz : ");
        muzik=scanner.nextInt();

        if(0<=mat && mat<=100
        && 0<=fizik && fizik<=100
        && 0<=kimya && kimya<=100
        && 0<=turkce && turkce<=100
        && 0<=muzik && muzik<=100)
        {double avarage = (mat + turkce + fizik + kimya + muzik) / 5;
            if(avarage <= 55){
                System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere! ");
            }else{
                System.out.println("Tebrikler, sınıf geçtiniz!");
            }
            System.out.println("Ortalamanız : " + avarage);
        }else{System.out.println("Notları 0 ile 100 arasında girmelisiniz");}

        }
}
