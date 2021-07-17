import java.util.Scanner;

public class Odev35 {
    public static int us(int taban,int usdeger){
        if (usdeger==0)
            return 1;
        else if(taban==1)
            return 1;
        else
            return taban*us(taban,usdeger-1);

    }
    public static void main(String[] args) {
        Scanner gir=new Scanner(System.in);
        System.out.print("Taban değeri giriniz : ");
        int taban=gir.nextInt();
        System.out.print("üs değeri giriniz : ");
        int usdeger=gir.nextInt();
        System.out.println("sonuc : "+us(taban, usdeger));

    }

}

