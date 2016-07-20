package Day5;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Created by Sierra S on 7/19/2016.
 */
public class Day5Part1 {

    public static void main(String[] args) throws IOException {

        ArrayList<String> naNiList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("NaughtyNiceList"))) {
            String line;
            while ((line = br.readLine()) != null) {
                naNiList.add(line);
            }
        }
        int niceCount = 0;
        //System.out.println(Pattern.matches(".*cd.*", naNiList.get(31)));


        for (int i = 0; i < naNiList.size(); i++) {
            boolean isNiceString = false;
            int vowelCount = 0;
            String temp = naNiList.get(i);

            //Check for at least 3 vowels in string
            for (char c : naNiList.get(i).toCharArray()) {
                if (c == 'a')
                vowelCount++;
               else if (c == 'e')
                    vowelCount++;
                else if (c == 'i')
                    vowelCount++;
                else if (c == 'o')
                    vowelCount++;
                else if (c == 'u')
                    vowelCount++;
            }
            if (vowelCount > 2) {

                //   Check for at least one letter that appears twice in a row
                    if (Pattern.matches(".*(\\w)\\1+.*", naNiList.get(i))) {

                        // Checks for strings ab, cd, pq, and xy
                        if (Pattern.matches(".*ab.*", naNiList.get(i)))
                            isNiceString = false;
                        else if (Pattern.matches(".*cd.*", naNiList.get(i)))
                            isNiceString = false;
                        else if (Pattern.matches(".*pq.*", naNiList.get(i)))
                            isNiceString = false;
                        else if (Pattern.matches(".*xy.*", naNiList.get(i)))
                            isNiceString = false;
                        else
                            isNiceString = true;

                    }
                }

            if (isNiceString == true)
                niceCount++;


        }
        System.out.println(niceCount);

    }
}