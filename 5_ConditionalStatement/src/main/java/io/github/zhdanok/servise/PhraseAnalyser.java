package io.github.zhdanok.servise;

public class PhraseAnalyser {
    public static String analyse(String str) {
        if ((str.indexOf("Make") == 0) && (str.lastIndexOf("great again") == (str.length() - 11))) {
            return "It stands no chance";
        } else if ((str.indexOf("Make") == 0) || (str.lastIndexOf("great again") == (str.length() - 11))) {
            return "It could be worse";
        } else
            return "It is fine, really";
    }
}
