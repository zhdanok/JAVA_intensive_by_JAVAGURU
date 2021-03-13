package io.github.zhdanok.exeptions;

public class TooShortNameExeption extends UserValidationException {
    public TooShortNameExeption() {
        super("FirstName or LastName too short!");
    }
}
