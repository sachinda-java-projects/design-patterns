package creational.abstractfactorymethod.impl.factory.bankfactory.impl;

public class NordeaBank implements Bank{

    private String bankName= null;
    public NordeaBank(){
        this.bankName = "Nordea";
    }


    @Override
    public String getBankName() {
        return this.bankName;
    }
}
