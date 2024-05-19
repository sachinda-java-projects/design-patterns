package creational.factorymethod.factory.impl;

public abstract class Plan {

    public double rate;

    public abstract void getRate();
    public void calculate(int uni){
        System.out.println(uni * rate);
    }
}
