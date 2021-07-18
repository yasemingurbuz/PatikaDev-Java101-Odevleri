import java.util.Scanner;

public class Odev45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gecici;

        System.out.print("Dizinin boyutunu giriniz n :");
        int  n = scan.nextInt();

        int [] dizi=new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
        }
        System.out.println("Dizinin kucukten buyuge dogru sıralanmıs hali:\n");
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }

        for(int i = 0; i < n; i++)
        {
            System.out.println("Dizinin " + (i+1) + ". elemanını : " + dizi[i]);
        }
    }
}