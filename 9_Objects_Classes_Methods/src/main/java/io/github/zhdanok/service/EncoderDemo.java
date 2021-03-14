package io.github.zhdanok.service;

import io.github.zhdanok.bean.Encoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EncoderDemo {

    Logger logger = LoggerFactory.getLogger(EncoderDemo.class);

    public void encode(Encoder encoder) {
        char symbol = (char) encoder.getCode();
        encoder.setSymbol(symbol);
        logger.info("Code = {}, Symbol = {}", encoder.getCode(), symbol);
    }

    public void decode(Encoder encoder) {
        short code = (short) encoder.getSymbol();
        encoder.setCode(code);
        logger.info("Symbol = {}, Code = {}", encoder.getSymbol(), code);
    }
}
