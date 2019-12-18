package Day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.*;

import static java.lang.Math.min;

/**
 * Created by Sierra S on 7/18/2016.
 */
public class wrappingPaper {

    public static void main(String [] args) throws IOException{



        ArrayList<String> shopList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("paper"))){
            String line;
            while ((line = br.readLine()) != null){
                shopList.add(line);
            }
        }

        int totalPaper=0;
        int totalRibbon = 0;
        for(int i= 0; i<shopList.size(); i++) {

            String temp = shopList.get(i);
            String delims = "[x]";
            String[] tokens = temp.split(delims);

                int lw = (Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[1])) ;
                int wh = (Integer.parseInt(tokens[1]) * Integer.parseInt(tokens[2]));
                int lh = (Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[2]));

            int minArea = Math.min(Math.min(lw,wh),lh);


            int smallPer = 0;
            int h = (Integer.parseInt(tokens[0]));
            int w = (Integer.parseInt(tokens[1]));
            int l = (Integer.parseInt(tokens[2]));
            int min1 = h+h + w + w;
            int min2 = 2*w + 2*l;
            int min3 = 2*h + 2*l;

            smallPer = Math.min(Math.min(min1,min2), min3);




            totalRibbon = totalRibbon + (h*l*w) + smallPer;

            totalPaper= totalPaper + (2*wh) + (2 * lw ) + (2*lh) + minArea;

        }




        System.out.println("Total ribbon needed: " + totalRibbon);



        System.out.println("Total Paper needed: " + totalPaper);


    }





}
