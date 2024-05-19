package creational.abstractfactorymethod.impl.factory.bankfactory;

import creational.abstractfactorymethod.AbstractFactory;
import creational.abstractfactorymethod.impl.factory.bankfactory.impl.Bank;
import creational.abstractfactorymethod.impl.factory.bankfactory.impl.ICABank;
import creational.abstractfactorymethod.impl.factory.bankfactory.impl.NordeaBank;
import creational.abstractfactorymethod.impl.factory.loanfactory.impl.Loan;

public class BankAbstractFactory extends AbstractFactory {

    public Bank getBank(String bankName){

        if(bankName == null){
            return null;
        }

        switch (bankName){
            case "NORDEA":
                return new NordeaBank();
            case "ICA":
                return new ICABank();
            default:
                return null;
        }
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }
}
