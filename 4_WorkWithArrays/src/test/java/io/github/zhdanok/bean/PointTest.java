package io.github.zhdanok.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    Point point;

    Logger logger = LoggerFactory.getLogger(PointTest.class);

    @Test
    void arrayTest() {
        Point[] points = new Point[5];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(i, i);
        }
        logger.info("{}", Arrays.toString(points));

        points[0].setX(1);
        points[0].setY(1);
        points[2].setX(3);
        points[2].setY(3);

        logger.info("{}", Arrays.toString(points));
    }

}