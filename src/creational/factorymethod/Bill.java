package creational.factorymethod;

import creational.factorymethod.factory.PlanFactory;
import creational.factorymethod.factory.impl.Plan;

public class Bill {

    public static void main(String[] args) {

        Plan plan = PlanFactory.getPlan("DOMESTIC");
        if(plan != null){
            plan.getRate();
            plan.calculate(10);
        }


    }
}
