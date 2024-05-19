package creational.abstractfactorymethod;

import creational.abstractfactorymethod.impl.factory.bankfactory.impl.Bank;
import creational.abstractfactorymethod.impl.factory.loanfactory.impl.Loan;

public abstract class AbstractFactory {

    public abstract Bank getBank(String bankName);
    public abstract Loan getLoan(String loanType);
}
