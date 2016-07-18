
import java.util.Scanner;

public class floorfinder{

    public static void main(String [] args) {

        Scanner myScan = new Scanner(System.in);
        String santaMap = myScan.next();

        int currFloor = 0;
        int mapSize = santaMap.length();

        for (int i = 0; i < mapSize; i++) {
            if(santaMap.substring(i, i+1).equals(")")){
                currFloor--;
                if (currFloor == -1){
                    System.out.println("Basement:" + (i+1));
                }
            }

            else
                currFloor++;
        }

        System.out.print(currFloor);

    }



}