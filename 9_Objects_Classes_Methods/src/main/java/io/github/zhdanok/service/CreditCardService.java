package io.github.zhdanok.service;

import io.github.zhdanok.bean.CreditCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CreditCardService {

    Logger logger = LoggerFactory.getLogger(CreditCardService.class);


    public void deposit(CreditCard creditCard, int testPIN, double sum) {
        if (checkPinCode(creditCard, testPIN)) {
            if (creditCard.getDebt() >= sum) {
                creditCard.setDebt(creditCard.getDebt() - sum);
            } else {
                creditCard.setBalance(creditCard.getBalance() + sum - creditCard.getDebt());
                creditCard.setDebt(0.);
            }

        } else {
            validationError();
        }

    }




    public void withdraw(CreditCard creditCard, int testPIN, double sum) {
        if (checkPinCode(creditCard, testPIN)) {
            if (creditCard.getBalance() >= sum) {
                creditCard.setBalance(creditCard.getBalance() - sum);
            } else if ((creditCard.getBalance() + creditCard.getCreditLimit()) >= sum){
                creditCard.setDebt(creditCard.getDebt() + sum - creditCard.getBalance());
                creditCard.setBalance(0.);
            } else {
                logger.info("Exceeding the CreditLimit!");
            }

        } else {
            validationError();
        }
    }

    public boolean checkPinCode(CreditCard creditCard, int testPIN) {
        if (creditCard.getCardPIN() == testPIN)
            return true;
        else
            return false;
    }

    public void validationError() {
        logger.info("PIN code entered incorrectly!");
    }
}
