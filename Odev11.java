import java.util.Scanner;

public class Odev11 {
    public static void main(String[] args) {
    int heat;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        heat = scanner.nextInt();

        if(heat <5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if(heat >= 5 && heat<=25){
            System.out.println("Sinemaya gidebilirsin.");
        }
        if(heat>=10){System.out.println("Pikniğe gidebilirsiniz.");}
        else if(heat >25)
    { System.out.println("Yüzmeye gidebilirsiniz.");}
    }
}
