import java.util.Scanner;

public class Odev36 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int num=scanner.nextInt();
        if(isPrime(num,num)){System.out.println(num+" bir asal sayı değildir");}
        else {System.out.println(num+" bir asal sayıdır");}
    }
    static boolean isPrime(int i, int num){

        if(num==2) return false;
        if(num%2 == 0)return true;
        if(i==1)return false;
        if(num%i ==0 && i!=num) return true;

        return isPrime(i-1,num);
    }

}
