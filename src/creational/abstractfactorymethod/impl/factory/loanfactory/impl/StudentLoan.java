package creational.abstractfactorymethod.impl.factory.loanfactory.impl;

public class StudentLoan implements Loan{

    private double rate;

    public StudentLoan(){
        this.rate = 9.2;
    }


    @Override
    public double getRate() {
        return this.rate;
    }
}
