package Adapter;

import Adaptee.Refrigerator;
import Target.PowerOutlet;

public class RefrigeratorAdapter implements PowerOutlet {

    private Refrigerator refrigerator;

    public void Refrigerator() {
        this.refrigerator = refrigerator;
    }
    @Override
    public String plugin() {

        return refrigerator.startCooling();
    }
}
