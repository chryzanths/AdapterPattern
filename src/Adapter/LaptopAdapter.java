package Adapter;

import Adaptee.Laptop;
import Target.PowerOutlet;

public class LaptopAdapter implements PowerOutlet {

    private Laptop laptop;

    public void Laptop() {
        this.laptop = laptop;
    }

    @Override
    public String plugin() {
        return laptop.charge();
    }
}
