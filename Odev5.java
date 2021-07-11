import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r= scanner.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz : ");
        a= scanner.nextInt();

        double alan = (pi*r*r*a)/360;
        System.out.println("Dairenin alanı : " + alan);
        
    }
}
