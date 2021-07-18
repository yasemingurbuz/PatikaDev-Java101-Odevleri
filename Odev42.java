import java.util.Arrays;
import java.util.Scanner;

public class Odev42 {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        System.out.println("Dizi : " + Arrays.toString(list));

        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();


        int min = Arrays.stream(list).min().orElse(num);
        int max = Arrays.stream(list).max().orElse(num);

        for (int i = 0; i<list.length; i++) {
            if (list[i] < num) {
                if(list[i]<max)
                max = list[i];
            }
            if (list[i] > num) {
                if(list[i]>min)
                min = list[i];
            }
        }
        System.out.println("Girilen Sayı : " + num);
        System.out.println("Girilen sayıdan küçük en yakın sayı :  " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

    }
}
