package Day3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Sierra S on 7/18/2016.
 */
public class Day3Part1 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> direc = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("directions"))) {
            String line = br.readLine();

            for (int i = 0; i < line.length(); i++) {
                direc.add(line.substring(i, i + 1));
            }

        }



        boolean[][] houses =new boolean[2*direc.size()][2*direc.size()];
        houses[2000][2000] = true;

        int a = 0;
        int x=2000;
        int y=2000;
        int b=2000;
        int c=2000;
        for(int i = 0;i<direc.size();i++) {

            if (direc.get(i).equals(">")) {
                x++;
                houses[x][y]=true;
            }
           else if (direc.get(i).equals("<")) {
                x--;
                houses[x][y]=true;
            }
        else if (direc.get(i).equals("^")) {
                y--;
                houses[x][y]=true;
            }
            else if (direc.get(i).equals("v")) {
                y++;
                houses[x][y]=true;
            }


        }



        for(int i = 0; i<houses.length; i++){
            for(int j=0; j<houses[0].length; j++){
                if(houses[i][j] == true)
                    a++;
            }
        }
       System.out.println("Number of houses with at least one present: " + a);
    }

}