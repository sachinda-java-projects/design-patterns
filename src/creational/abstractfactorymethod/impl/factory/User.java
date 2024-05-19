package creational.abstractfactorymethod.impl.factory;

import creational.abstractfactorymethod.AbstractFactory;
import creational.abstractfactorymethod.FactoryCreator;
import creational.abstractfactorymethod.impl.factory.bankfactory.impl.Bank;

public class User {

    public static void main(String[] args) {

        AbstractFactory abstractFactory = FactoryCreator.getFactory("BANK");

        Bank bank = abstractFactory.getBank("NORDEA");

        System.out.println(bank.getBankName());


    }
}
