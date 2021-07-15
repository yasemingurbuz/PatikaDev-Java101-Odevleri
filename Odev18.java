import java.util.Scanner;

public class Odev18 {
    public static void main(String[] args) {
        int n,total=0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Sayı giriniz : ");
            n= scanner.nextInt();
            if(n%8 ==0){
                total += n;
            }
        }while(n%2==0);
        System.out.print("Toplam : " + total);
    }
}
