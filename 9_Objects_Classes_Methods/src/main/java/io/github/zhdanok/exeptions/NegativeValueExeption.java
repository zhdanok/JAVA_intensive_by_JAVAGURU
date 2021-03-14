package io.github.zhdanok.exeptions;

public class NegativeValueExeption extends Exception{
    public NegativeValueExeption() {
        super("Negative value is impossible!");
    }
}
