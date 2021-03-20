package io.github.zhdanok.bean;

public class CreditCard {

    private String cardNumber;
    private int cardPIN;
    private double balance;
    private double creditLimit;
    private double debt;

    public CreditCard(String cardNumber, int cardPIN) {
        this.cardNumber = cardNumber;
        this.cardPIN = cardPIN;
        this.balance = 0.;
        this.debt = 0.;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public int getCardPIN() {
        return cardPIN;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getDebt() {
        return debt;
    }

}
