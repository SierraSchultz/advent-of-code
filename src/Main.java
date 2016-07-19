import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Sierra S on 7/19/2016.
 */
public class Main {

    public static void main(String[] args){

    }



    public String fileToString(File file) throws IOException{
        String fromFile = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null){

                fromFile = fromFile + line;
            }
        }
        return fromFile;
    }

}
