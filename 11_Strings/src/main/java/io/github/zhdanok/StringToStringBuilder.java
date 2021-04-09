package io.github.zhdanok;

public class StringToStringBuilder {

    public String transformText(String text) {
        String[] textArray = text.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].contentEquals("Выбирать") ||
                    textArray[i].contentEquals("решения") ||
                    textArray[i].contentEquals("это") ||
                    textArray[i].contentEquals("легко")) {
                if (str.indexOf(textArray[i]) < 0) {
                    str.append(textArray[i]);
                    str.append(" ");
                }
            }

        }
        str.replace(16, 17, " - это ");
        str.delete(28, 33);
        str.insert(str.length(), ".");

        return str.toString();
    }
}
