import java.util.Scanner;

public class Odev15 {
    public static void main(String[] args) {
        int yıl;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum yılını giriniz : ");
        yıl= scanner.nextInt();
        if((yıl%12)==0){System.out.print("Maymun");}
        else if ((yıl%12)==1){System.out.print("Horoz");}
        else if ((yıl%12)==2){System.out.print("Köpek");}
        else if ((yıl%12)==3){System.out.print("Domuz");}
        else if ((yıl%12)==4){System.out.print("Fare");}
        else if ((yıl%12)==5){System.out.print("Öküz");}
        else if ((yıl%12)==6){System.out.print("Kaplan");}
        else if ((yıl%12)==7){System.out.print("Tavşan");}
        else if ((yıl%12)==8){System.out.print("Ejderha");}
        else if ((yıl%12)==9){System.out.print("Yılan");}
        else if ((yıl%12)==10){System.out.print("At");}
        else if ((yıl%12)==11){System.out.print("Koyun");}
        else {System.out.println("Yanlış değer girdiniz!19 ");}

    }
}
