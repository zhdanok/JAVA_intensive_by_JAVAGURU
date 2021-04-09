package io.github.zhdanok;

import java.util.Random;

public class LectureBot {

    public static final String[][] UNIVERSAL_CODE = new String[][]{
            {"Товарищи!", "реализация намеченных плановых заданий", "играет важную роль в формировании", "существующих финансовых и административных условий"},
            {"С другой стороны", "рамки и место обучения кадров", "требуют от нас анализа", "дальнейших направлений развития"},
            {"Не следует, однако, забывать, что", "сложившаяся структура организации", "способствует подготовке и реализации", "позици, занимаемых участниками в отношении поставленных задач"},
            {"Таким образом", "новая модель организации деятельности", "обеспечивает широкому кругу специалистов участие в формировании", "новых предложений"},
            {"Повседневная практика показывает, что", "дальнейшее развитие различных форм деятельности", "позволяет выполнить важные задания по разработке", "направлений прогрессивного развития"}
    };


    public String createText() {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < UNIVERSAL_CODE[0].length; i++) {
            int line = random.nextInt(UNIVERSAL_CODE.length);
            stringBuffer.append(UNIVERSAL_CODE[line][i]);
            stringBuffer.append(" ");

        }
        return stringBuffer.toString();
    }
}
