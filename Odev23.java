import java.util.Scanner;

public class Odev23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        double n=scanner.nextInt();
        double result =0;
        while (n>0){
            result +=(1/n);
            n--;
        }
        System.out.println(result);
    }
}
