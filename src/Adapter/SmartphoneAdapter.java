package Adapter;

import Adaptee.Refrigerator;
import Adaptee.Smartphone;
import Target.PowerOutlet;

public class SmartphoneAdapter implements PowerOutlet {


    private Smartphone smartphone;

    public void Refrigerator() {
        this.smartphone = smartphone;
    }

    @Override
    public String plugin() {

        return smartphone.chargePhone();
    }
}
