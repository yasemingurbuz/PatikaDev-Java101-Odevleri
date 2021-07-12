import java.util.Scanner;

public class Odev13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ay, day;

        System.out.print("Doğduğunuz ay : ");
        ay = scan.nextInt();
        System.out.print("Doğduğunuz gün : ");
        day = scan.nextInt();

        if (ay == 1) {
            if (day < 22) {
                System.out.println("Oğlak Burcu");
            } else {
                System.out.println("Kova Burcu");
            }
        } else if (ay == 2) {
            if (day < 20) {
                System.out.println("Kova Burcu");
            } else {
                System.out.println("Balık Burcu");
            }
        } else if (ay == 3) {
            if (day < 21) {
                System.out.println("Balık Burcu");
            } else {
                System.out.println("Koç Burcu");
            }
        } else if (ay == 4) {
            if (day < 21) {
                System.out.println("Koç Burcu");
            } else {
                System.out.println("Boğa Burcu");
            }
        } else if (ay == 5) {
            if (day < 23) {
                System.out.println("Boğa Burcu");
            } else {
                System.out.println("İkizler Burcu");
            }
        } else if (ay == 6) {
            if (day < 23) {
                System.out.println("İkizler Burcu");
            } else {
                System.out.println("Yengeç Burcu");
            }
        } else if (ay == 7) {
            if (day < 23) {
                System.out.println("Yengeç Burcu");
            } else {
                System.out.println("Aslan Burcu");
            }
        } else if (ay == 8) {
            if (day < 23) {
                System.out.println("Aslan Burcu");
            } else {
                System.out.println("Başak Burcu");
            }
        } else if (ay == 9) {
            if (day < 23) {
                System.out.println("Başak Burcu");
            } else {
                System.out.println("Terazi Burcu");
            }
        } else if (ay == 10) {
            if (day < 23) {
                System.out.println("Terazi Burcu");
            } else {
                System.out.println("Akrep Burcu");
            }
        } else if (ay == 11) {
            if (day < 22) {
                System.out.println("Akrep Burcu");
            } else {
                System.out.println("Yay Burcu");
            }
        } else if (ay == 12) {
            if (day < 22) {
                System.out.println("Yay Burcu");
            } else {
                System.out.println("Oğlak Burcu");
            }
        }
    }

}