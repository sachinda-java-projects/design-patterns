package creational.abstractfactorymethod.impl.factory.bankfactory.impl;

public class ICABank implements Bank{

    private String bankName= null;
    public ICABank(){
        this.bankName = "ICA";
    }


    @Override
    public String getBankName() {
        return this.bankName;
    }
}
