import java.util.Scanner;

public class Odev20 {
    public static void main(String[] args) {
        // n! = 1*2*3*4* .......*n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman sayısı (n) : ");
        int n = scanner.nextInt();
        System.out.print("Seçim sayısı (r) : ");
        int r = scanner.nextInt();

        int faktoriyen_n =1;
        int faktoriyel_r=1;
        int faktoriyeln_r=1;

        for(int i=1; i<= n; i++){
            faktoriyen_n = faktoriyen_n*i;
        }
        for(int j=1; j<= r; j++){
            faktoriyel_r = faktoriyel_r*j;
        }

        for(int k=1; k<= n-r; k++){
            faktoriyeln_r = faktoriyeln_r*k;
        }

if(n<r){System.out.println("n sayısı r sayısından büyük olmalıdır.");}
else{
        int kom= faktoriyen_n/(faktoriyel_r*faktoriyeln_r);
        System.out.println(n + " Kombinasyon : "+ kom);
    }
}}

