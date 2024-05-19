package creational.abstractfactorymethod.impl.factory.loanfactory;

import creational.abstractfactorymethod.AbstractFactory;
import creational.abstractfactorymethod.impl.factory.bankfactory.impl.Bank;
import creational.abstractfactorymethod.impl.factory.loanfactory.impl.BusinessLoan;
import creational.abstractfactorymethod.impl.factory.loanfactory.impl.Loan;
import creational.abstractfactorymethod.impl.factory.loanfactory.impl.StudentLoan;

public class LoanAbstractFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bankName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
        if(loanType == null){
            return null;
        }

        switch (loanType){
            case "BUSINESS":
                return new BusinessLoan();
            case "STUDENT":
                return new StudentLoan();
            default:
                return null;
        }

    }
}
