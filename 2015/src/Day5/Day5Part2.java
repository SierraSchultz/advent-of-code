package Day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Sierra S on 7/20/2016.
 */
public class Day5Part2 {

    public static void main (String[] args) throws IOException{
        ArrayList<String> naNiList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("NaughtyNiceList"))) {
            String line;
            while ((line = br.readLine()) != null) {
                naNiList.add(line);
            }
        }
        int count = 0;
        int niceCount = 0;
//        System.out.println(splitRepeat("ieodomkazucvgmuy") + " " + repeatDouble("ieodomkazucvgmuy"));
        for(String str: naNiList){
        boolean isNiceString = false;
           if(repeatDouble(str)){
                 if(splitRepeat(str)){
                     isNiceString = true;
            }
            }
            if(isNiceString)
                niceCount++;
            count++;
          System.out.println(count + " " + "Number of nice strings: " + niceCount);
        }


    }

    //Checks for pair of letters that appears at least twice in a string
    private static boolean repeatDouble (String str){
     //   System.out.println(str);
        boolean goodRepeat=false;
        for (int i=0; i<str.length()-3; i++) {
            String charDouble = str.substring(i, i + 2);

            System.out.print( charDouble + " ");
            for (int j = i+2; j < str.length() - 1; j++) {
               // if (j - 2 != i) {
                    String test = str.substring(j, j + 2);
                   // System.out.println("Test: " + test);
                    if (charDouble.equals(str.substring(j, j + 2))) {
                        goodRepeat = true;
                        //System.out.print(i + " " + str);
                 //   }
                }
            }
        }
//ystem.out.println(goodRepeat);
        return goodRepeat;
    }

    //Checks if string contains at least one letter which repeats with exactly one letter in between it
    private static boolean splitRepeat(String str){

        boolean hasSplit = false;
            for(int i=0; i<str.length()-2; i++){
                char c = str.charAt(i);

                    if(str.charAt(i+2) == c) {
                        hasSplit = true;


                    }
            }


        return hasSplit;
    }
}
