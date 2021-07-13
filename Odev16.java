import java.util.Scanner;

public class Odev16 {
    public static void main(String[] args) {
        int yıl;
        boolean artik = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl giriniz : ");
        yıl=scanner.nextInt();
        if(yıl % 4 == 0)
        {
            if( yıl % 100 == 0)
            {
                if ( yıl % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;

        if(artik)
        {System.out.println(yıl + " bir artık yıldır!");}
        else {System.out.println(yıl + " bir artık yıl değildir!");}
    }
}
