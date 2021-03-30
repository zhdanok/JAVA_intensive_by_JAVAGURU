package io.github.zhdanok.service;

import io.github.zhdanok.bean.Encoder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderDemoTest {

    EncoderDemo encoderDemo = new EncoderDemo();

    @Test
    void encodeTest() {
        Encoder encoder = new Encoder((short) 65);
        encoderDemo.encode(encoder);
        assertTrue(encoderDemo.logger.isInfoEnabled());
        assertEquals('A', encoder.getSymbol());
    }

    @Test
    void decodeTest() {
        Encoder encoder = new Encoder('X');
        encoderDemo.decode(encoder);
        assertTrue(encoderDemo.logger.isInfoEnabled());
        assertEquals(88, encoder.getCode() );
    }

}