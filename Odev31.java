public class Odev31 {
    public static void main(String[] args) {

        int a = 0, b = 1, c;

        for(int i=1; i<9 ; i++){
            c=a+b;
            System.out.println(a+"+"+b+"="+c);
            a=b;
            b=c;

        }


    }

}

