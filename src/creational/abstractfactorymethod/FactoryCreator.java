package creational.abstractfactorymethod;

import creational.abstractfactorymethod.impl.factory.bankfactory.BankAbstractFactory;
import creational.abstractfactorymethod.impl.factory.loanfactory.LoanAbstractFactory;

public class FactoryCreator {

    public static AbstractFactory getFactory(String type){

        switch (type){
            case "BANK":
                return new BankAbstractFactory();
            case "LOAN":
                return new LoanAbstractFactory();
            default:
                return null;
        }
    }
}
