package io.github.zhdanok.exeptions;

public class TooOldExeption extends UserValidationException {
    public TooOldExeption() {
        super("Too old!");
    }
}
