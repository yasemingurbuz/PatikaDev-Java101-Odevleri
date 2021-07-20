package MayınTarlası;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    char arr[][];
    char mine[][];
    int safeZone;
    boolean gameFinished;

    public MineSweeper(int row,int column) {
        Random random = new Random();
        gameFinished= false;
        arr = new char[row][column];
        mine = new char[row][column];
        int mineSize = (row * column) / 4;
        safeZone = row *column - mineSize;

        for (char [] rowArr : arr)
            Arrays.fill(rowArr,'-');

        while( mineSize > 0){
            int a = random.nextInt(row);
            int b = random.nextInt(column);
            if( mine[a][b] != '*') {
                mine[a][b] = '*';
                mineSize--;
            }
        }
    }

    public void run(){
        while (!gameFinished){
            writeArr();
            getInput();
        }
        if(safeZone == 0){
            System.out.println("You Win!");
        }else{
            System.out.println("Game Over!!");
        }
    }
    public void writeArr(){
        for( int i = 0; i < arr.length; i++ ){
            for( int k = 0; k < arr[i].length ; k++ ){
                System.out.print(arr[i][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
    public void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Satır Giriniz : ");
        int row = scan.nextInt();
        System.out.print("Sütun Giriniz : ");
        int column = scan.nextInt();
        openSelection(row,column);
    }
    public void openSelection(int row ,int column) {

        int cnt = 0;
        if(mine[row][column] == '*' ) {
            gameFinished = true;
            return;
        }
        for (int i = -1; i < 2; i++) {
            for (int k = -1; k < 2; k++) {
                try {
                    if (mine[row + i][column + k] == '*')
                        cnt++;
                } catch (Exception e) {
                }
            }
        }
        arr[row][column] = (char)(cnt+'0');
        safeZone--;
        if( safeZone == 0 )
            gameFinished = true;
    }
}
