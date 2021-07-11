import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlıcan,tutar;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilo ? : ");
        armut = scanner.nextInt();
        System.out.print("Elma kaç kilo ? : ");
        elma = scanner.nextInt();
        System.out.print("Domates kaç kilo ? : ");
        domates = scanner.nextInt();
        System.out.print("Muz kaç kilo ? : ");
        muz = scanner.nextInt();
        System.out.print("Patlıcan kaç kilo ? : ");
        patlıcan = scanner.nextInt();

        tutar = (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5.00);
        System.out.println("Toplam tutar : " + tutar + "TL");

    }}
