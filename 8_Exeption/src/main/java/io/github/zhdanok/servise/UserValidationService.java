package io.github.zhdanok.servise;

import io.github.zhdanok.bean.User;
import io.github.zhdanok.exeptions.UserValidationException;

public class UserValidationService {

    User user1 = new User("Liudmila", "Zhdanok", 33);
    User user2 = new User("Sergey", "Li", 30);
    User user3 = new User("Shermyhamadgumang", "Satbaev", 65);
    User user4 = new User("Dynkan", "McCloud", 400);
    User user5 = new User("Oleg", "Christorozhdestvensky", 121);


    public void userCheck(User user) throws UserValidationException {
        if (user.getFirstName().length() < 3 || user.getLastName().length() < 3) {
            throw new UserValidationException("FirstName or LastName too short!");
        }
        if (user.getFirstName().length() > 15 || user.getLastName().length() > 15) {
            throw new UserValidationException("FirstName or LastName too long!");
        }
        if (user.getAge() > 120) {
            throw new UserValidationException("Too old!");
        }

    }
}
