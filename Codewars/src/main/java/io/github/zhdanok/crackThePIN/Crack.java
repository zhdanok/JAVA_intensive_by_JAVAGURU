package io.github.zhdanok.crackThePIN;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Crack {

    public String crackThePIN(String hashMD5) {
        for (int i = 0; i < 100000; i++) {
            String num = String.valueOf(i);
            while (num.length() < 5) {
                num = "0" + num;
            }
            String hashNum = md5(num);
            if (hashNum.equals(hashMD5)) {
                return num;
            }


        }
        return null;
    }





    public String md5(String in) {
        String result = null;
        try
        {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            digest.reset();
            digest.update(in.getBytes());
            BigInteger bigInt = new BigInteger(1, digest.digest());
            result = bigInt.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }


}
