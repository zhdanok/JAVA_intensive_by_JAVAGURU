package io.github.zhdanok.exeptions;

public class TooLongNameExeption extends UserValidationException{
    public TooLongNameExeption () {
        super("FirstName or LastName too long!");
    }
}
