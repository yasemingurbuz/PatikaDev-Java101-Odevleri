import java.util.Scanner;

public class Odev22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı girin :");
        int number= scanner.nextInt();
        int piece =0,total=0;
        while(number!=0){
            total=(number%10)+total;
            number/=10;
            ++piece;
        }
        System.out.println("Basamak toplamı: " + total);
    }
}
