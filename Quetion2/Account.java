package Quetion2;

abstract class Account{
    public double interestRate;
    public double amount;
    abstract double calculateInterest() throws InvalidInputException;
}

