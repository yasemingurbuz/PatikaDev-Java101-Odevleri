import java.util.Scanner;

public class Odev37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N Sayısı : ");
        int n = scanner.nextInt();
        System.out.print("Çıktısı : " );
        func(n,true ,n);

    }
    static void func(int number ,boolean flag, int start){
        if(number < 0 ) flag = false;
        System.out.print(" "+ number);
        if(flag) {
            func(number-5,flag,start);
        }else{
            if( number == start )
                return;
            func(number+5,flag,start);

        }

    }
}
