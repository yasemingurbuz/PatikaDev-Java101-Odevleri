import java.util.Scanner;

public class Odev19 {
    public static void main(String[] args) {
       int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        n=scanner.nextInt();
        for(int i = 1; i <= n; i*=20){
            System.out.println(i);
        }
    }
}
