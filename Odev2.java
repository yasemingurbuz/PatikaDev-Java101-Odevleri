import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        double tutar,kdvTutar,kdvliTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        tutar = scanner.nextDouble();
        if(0.0 <= tutar || tutar <= 1000.0){
           double kdvOran = 0.18;
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV'siz Tutar : " + tutar);
            System.out.println("KDV Oranı : " + kdvOran);
            System.out.println("KDV Tutarı : " + kdvTutar);
            System.out.println("KDV'li Tutarı : " + kdvliTutar);

        }
        else if ( tutar > 1000.0 )
        {   double kdvOran = 0.08;
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV'siz Tutar : " + tutar);
            System.out.println("KDV Oranı : " + kdvOran);
            System.out.println("KDV Tutarı : " + kdvTutar);
            System.out.println("KDV'li Tutarı : " + kdvliTutar);

        }
         }
}
