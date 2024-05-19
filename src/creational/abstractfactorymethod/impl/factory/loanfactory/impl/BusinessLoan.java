package creational.abstractfactorymethod.impl.factory.loanfactory.impl;

public class BusinessLoan implements Loan{

    private double rate;

    public BusinessLoan(){
        this.rate = 9.2;
    }


    @Override
    public double getRate() {
        return this.rate;
    }
}
