import java.util.Scanner;

public class Odev21 {
    public static void main(String[] args) {
        int n,k;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n=scanner.nextInt();
        System.out.print("Üs olacak sayı : ");
        k=scanner.nextInt();

        int total=1;
        for( ;k!=0 ;--k){
            total *= n;

        }
    System.out.println("Cevap " + total);
    }
}
