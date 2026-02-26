package Quetion2;

class SBAccount extends Account{

    SBAccount(double amount){
        this.amount = amount;
    }

    @Override
    double calculateInterest() throws InvalidInputException{
        if(amount < 0)
            throw new InvalidInputException("Invalid Amount");
        return (amount * 7.5) / 100;
    }
}
