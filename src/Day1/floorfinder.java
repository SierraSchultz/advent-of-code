package Day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class floorfinder{

    public static void main(String [] args) throws IOException {

String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader("map.txt"))) {
          line = br.readLine();
        }

        int currFloor = 0;
        int mapSize = line.length();

        for (int i = 0; i < mapSize; i++) {
            if(line.substring(i, i+1).equals(")")){
                currFloor--;
                if (currFloor == -1){
                    System.out.println("Basement:" + (i+1));
                }
            }

            else
                currFloor++;
        }

        System.out.print("Santa's Final Floor: " + currFloor);

    }



}