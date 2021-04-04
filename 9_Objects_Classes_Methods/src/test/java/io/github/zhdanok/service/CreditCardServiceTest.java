package io.github.zhdanok.service;

import io.github.zhdanok.bean.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class CreditCardServiceTest {

    CreditCardService creditCardService;
    CreditCard creditCard;

    @BeforeEach
    void setUp() {
        creditCardService = new CreditCardService();
        creditCard = new CreditCard("1234 5864 9567 0001", 5317);
    }

    @Test
    void checkPinCodePositive() {
        int testPIN = 5317;
        double sum = 100.;
        boolean actuale = creditCardService.checkPinCode(creditCard, testPIN);
        assertEquals(true, actuale);
        creditCardService.deposit(creditCard, testPIN, sum);
        assertEquals(100., creditCard.getBalance(), 0.01);
    }

    @Test
    void checkPinCodeNegative() {
        int testPIN = 5717;
        double sum = 100.;
        boolean actuale = creditCardService.checkPinCode(creditCard, testPIN);
        assertEquals(false, actuale);
        creditCardService.deposit(creditCard, testPIN, sum);
        assertEquals(0., creditCard.getBalance(), 0.01);
    }

    @Test
    void depositIfDebtIsMoreThanTheSum() {
        int testPIN = 5317;
        creditCard.setDebt(170.5);
        double sum = 100.;
        creditCardService.deposit(creditCard, testPIN, sum);
        assertEquals(0., creditCard.getBalance(), 0.01);
        assertEquals(70.5, creditCard.getDebt(), 0.01);
    }

    @Test
    void depositIfDebtEqualsTheSum() {
        int testPIN = 5317;
        creditCard.setDebt(100.);
        double sum = 100.;
        creditCardService.deposit(creditCard, testPIN, sum);
        assertEquals(0., creditCard.getBalance(), 0.01);
        assertEquals(0., creditCard.getDebt(), 0.01);
    }

    @Test
    void depositIfDebtIsLessThanTheSum() {
        int testPIN = 5317;
        creditCard.setDebt(70.5);
        double sum = 100.;
        creditCardService.deposit(creditCard, testPIN, sum);
        assertEquals(29.5, creditCard.getBalance(), 0.01);
        assertEquals(0., creditCard.getDebt(), 0.01);
    }

    @Test
    void withdrawIfSumIsLessThanTheBalance() {
        int testPIN = 5317;
        creditCard.setCreditLimit(200.);
        creditCard.setBalance(100.);
        double sum = 75.5;
        creditCardService.withdraw(creditCard, testPIN, sum);
        assertEquals(24.5, creditCard.getBalance(), 0.01);
        assertEquals(0., creditCard.getDebt(), 0.01);
    }

    @Test
    void withdrawIfSumEqualsTheBalance() {
        int testPIN = 5317;
        creditCard.setCreditLimit(200.);
        creditCard.setBalance(100.);
        double sum = 100.;
        creditCardService.withdraw(creditCard, testPIN, sum);
        assertEquals(0., creditCard.getBalance(), 0.01);
        assertEquals(0., creditCard.getDebt(), 0.01);
    }

    @Test
    void withdrawIfSumMoreThatTheBalance() {
        int testPIN = 5317;
        creditCard.setCreditLimit(200.);
        creditCard.setBalance(100.);
        double sum = 150.;
        creditCardService.withdraw(creditCard, testPIN, sum);
        assertEquals(0., creditCard.getBalance(), 0.01);
        assertEquals(50., creditCard.getDebt(), 0.01);
    }

    @Test
    void exceedingTheLimit() {
        int testPIN = 5317;
        creditCard.setCreditLimit(200.);
        creditCard.setBalance(100.);
        double sum = 350.;
        creditCardService.withdraw(creditCard, testPIN, sum);
        assertEquals(100., creditCard.getBalance(), 0.01);
        assertEquals(0., creditCard.getDebt(), 0.01);
    }

}