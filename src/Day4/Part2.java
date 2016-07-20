package Day4;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Sierra S on 7/19/2016.
 */
public class Part2 {


    public static void main(String[] args) throws NoSuchAlgorithmException {

        String key = "yzbqklnj";

        MessageDigest md = MessageDigest.getInstance("MD5");

        for (int j=200000; j<10000000; j++){


            byte[] bytes = MessageDigest.getInstance("MD5").digest((key + Integer.toString(j)).getBytes());
            String hexString1 = toHex(bytes);

            if(hexString1.substring(0,6).equals("000000")){
                System.out.println(j);
            }

        }

    }


    public static String toHex(byte[] bytes){

        BigInteger bigInt = new BigInteger(1, bytes);
        String string = bigInt.toString(16);
        while(string.length() < 32)
            string = "0" + string;
        return string;
    }



}
