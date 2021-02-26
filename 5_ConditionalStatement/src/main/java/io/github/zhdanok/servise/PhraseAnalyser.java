package io.github.zhdanok.servise;

public class PhraseAnalyser {
    public static String analyse(String str) {
        int begin = str.indexOf("Make");
        int end = str.lastIndexOf("great again");
        if ((begin == 0) && ( end == (str.length() - 11))) {
            return "It stands no chance";
        } else if ((begin == 0) || (end == (str.length() - 11))) {
            return "It could be worse";
        } else
            return "It is fine, really";
    }
}

