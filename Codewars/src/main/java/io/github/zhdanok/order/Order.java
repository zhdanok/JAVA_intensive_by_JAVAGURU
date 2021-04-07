package io.github.zhdanok.order;

public class Order {


    public static String order(String words) {
        String[] substrings = words.split(" ");
        String[] actualArray = new String[substrings.length];
        for (int i = 0; i < substrings.length; i++) {
             for (int j = 1; j < 10; j++) {
                if (substrings[i].contains(String.valueOf(j))) {
                    actualArray[j - 1] = substrings[i];
                    break;
                }
            }
        }
        String actualStr = "";
        if (actualArray[0] == null) {
            return actualStr;
        } else {
            for (int i = 0; i < substrings.length - 1; i++) {
                actualStr += actualArray[i] + " ";
            }
            actualStr += actualArray[substrings.length - 1];

            return actualStr;
        }
    }
}
