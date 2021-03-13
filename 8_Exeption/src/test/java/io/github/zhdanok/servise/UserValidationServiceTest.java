package io.github.zhdanok.servise;

import io.github.zhdanok.bean.User;
import io.github.zhdanok.exeptions.TooLongNameExeption;
import io.github.zhdanok.exeptions.TooOldExeption;
import io.github.zhdanok.exeptions.TooShortNameExeption;
import io.github.zhdanok.exeptions.UserValidationException;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationServiceTest {

    Logger logger = LoggerFactory.getLogger(UserValidationServiceTest.class);

    UserValidationService userValidationService = new UserValidationService();

    User user1 = new User("Liudmila", "Zhdanok", 33);
    User user2 = new User("Sergey", "Li", 30);
    User user3 = new User("Shermyhamadgumang", "Satbaev", 65);
    User user4 = new User("Dynkan", "McCloud", 400);
    User user5 = new User("Oleg", "Christorozhdestvensky", 121);



    @Test
    void userCheckPositive() {
        userValidationService.userCheck(user1);
        logger.info("User is successfully checked");
    }

    @Test
    void userCheckNegative2() {
        Throwable e = assertThrows(TooShortNameExeption.class, () -> {
            userValidationService.userCheck(user2);
        });
        assertEquals("FirstName or LastName too short!", e.getMessage());

    }

    @Test
    void userCheckNegative3() {
        Throwable e = assertThrows(TooLongNameExeption.class, () -> {
            userValidationService.userCheck(user3);
        });
        assertEquals("FirstName or LastName too long!", e.getMessage());

    }

    @Test
    void userCheckNegative4() {
        Throwable e = assertThrows(TooOldExeption.class, () -> {
            userValidationService.userCheck(user4);
        });
        assertEquals("Too old!", e.getMessage());

    }

    @Test
    void userCheckNegative5() {
        Throwable e = assertThrows(UserValidationException.class, () -> {
            userValidationService.userCheck(user5);
        });
        assertEquals("FirstName or LastName too long!", e.getMessage());
    }
}

