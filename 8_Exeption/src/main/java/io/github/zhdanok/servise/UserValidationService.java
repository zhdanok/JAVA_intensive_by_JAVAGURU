package io.github.zhdanok.servise;

import io.github.zhdanok.bean.User;
import io.github.zhdanok.exeptions.TooLongNameExeption;
import io.github.zhdanok.exeptions.TooOldExeption;
import io.github.zhdanok.exeptions.TooShortNameExeption;
import io.github.zhdanok.exeptions.UserValidationException;

import static io.github.zhdanok.constants.Constants.*;

public class UserValidationService {


    public void userCheck(User user) throws UserValidationException {

        if (user.getFirstName().length() < Integer.valueOf(MIN_LENGTH_OF_NAME) || user.getLastName().length() < Integer.valueOf(MIN_LENGTH_OF_NAME)) {
            throw new TooShortNameExeption();
        }
        if (user.getFirstName().length() > Integer.valueOf(MAX_LENGTH_OF_NAME) || user.getLastName().length() > Integer.valueOf(MAX_LENGTH_OF_NAME)) {
            throw new TooLongNameExeption();
        }
        if (user.getAge() > Integer.valueOf(MAX_AGE)) {
            throw new TooOldExeption();
        }
    }
}
