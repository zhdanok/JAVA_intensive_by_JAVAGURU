package io.github.zhdanok.bean;

public class Encoder {
    private short code;
    private char symbol;

    public Encoder() {
    }

    public Encoder(short code) {
        this.code = code;
    }

    public Encoder(char symbol) {
        this.symbol = symbol;
    }

    public short getCode() {
        return code;
    }

    public void setCode(short code) {
        this.code = code;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}
