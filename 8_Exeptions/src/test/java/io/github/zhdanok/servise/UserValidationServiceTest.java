package io.github.zhdanok.servise;

import io.github.zhdanok.exeptions.UserValidationException;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationServiceTest {

    UserValidationService userValidationService = new UserValidationService();

    Logger logger = LoggerFactory.getLogger(UserValidationServiceTest.class);

    @Test
    void userCheckPositive() {
        userValidationService.userCheck(userValidationService.user1);
        logger.info("User is successfully checked");
    }

    @Test
    void userCheckNegative2() {
        try {
            userValidationService.userCheck(userValidationService.user2);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }

    @Test
    void userCheckNegativeThrows() {
        assertThrows(UserValidationException.class, () -> {
            userValidationService.userCheck(userValidationService.user2);
        });

    }

    @Test
    void userCheckNegative3() {
        try {
            userValidationService.userCheck(userValidationService.user3);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }

    @Test
    void userCheckNegative4() {
        try {
            userValidationService.userCheck(userValidationService.user4);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }

    @Test
    void userCheckNegative5() {
        try {
            userValidationService.userCheck(userValidationService.user5);
        } catch (UserValidationException e) {
            e.printStackTrace();
        }
    }
}

