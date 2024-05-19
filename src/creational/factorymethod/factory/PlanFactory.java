package creational.factorymethod.factory;

import creational.factorymethod.factory.impl.CommercialPlan;
import creational.factorymethod.factory.impl.DomesticPlan;
import creational.factorymethod.factory.impl.InstitutationalPlan;
import creational.factorymethod.factory.impl.Plan;

public class PlanFactory {

    public static Plan getPlan(String planType){

        switch (planType){
            case "DOMESTIC":
                return new DomesticPlan();
            case "COMMERCIAL":
                return new CommercialPlan();
            case "INSTITUTAION":
                return new InstitutationalPlan();
            default:
                return null;
        }
    }
}
