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

                int t = (Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[1])) ;
                int s = (Integer.parseInt(tokens[1]) * Integer.parseInt(tokens[2]));
                int u = (Integer.parseInt(tokens[0]) * Integer.parseInt(tokens[2]));

            int min = -1;
            if (t<s) {
                min = t;
                if (u < t)
                    min = u;
            }
            if (u<s){
                min = u;
                if (t<u)
                    min = t;
            }
            if (s < t){
                min = s;
                if (u<s)
                    min = u;
            }

            if ( u < t){
                min = u;
                if (s<u)
                    min = s;
            }
            if (s<u){
                min = s;
                if (t<s)
                    min = t;
            }

            int smallPer = 0;
            int h = (Integer.parseInt(tokens[0]));
            int w = (Integer.parseInt(tokens[1]));
            int l = (Integer.parseInt(tokens[2]));
            int min1 = h+h + w + w;
            int min2 = 2*w + 2*l;
            int min3 = 2*h + 2*l;

            if (min1<min2){
                smallPer = min1;
                if (min3 < min1)
                    smallPer = min3;
            }
            if (min3< min2){
                smallPer = min3;
                if (min1< min3)
                    smallPer = min1;
            }
            if (min1 < min3){
                smallPer = min1;
                if (min2<min1)
                    smallPer = min2;
            }
            if (min2<min3){
                smallPer = min2;
                if(min1<min2)
                    smallPer = min1;
            }
            if(min2<min1){
                smallPer = min2;
                if (min3<min2)
                    smallPer = min3;
            }
            if(min3<min1){
                smallPer= min3;
                if(min2<min3)
                    smallPer= min2;
            }



            totalRibbon = totalRibbon + (h*l*w) + smallPer;

            totalPaper= totalPaper + (2*s) + (2 * t ) + (2*u) + min;

        }




        System.out.println("Total ribbon needed: " + totalRibbon);



        System.out.println("Total Paper needed: " + totalPaper);


    }


    


}
