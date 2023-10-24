package Client;

import Adaptee.Laptop;
import Adaptee.Refrigerator;
import Adaptee.Smartphone;


public class CentralHub
{
    public static void main(String[] args)
    {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        Smartphone smartphone = new Smartphone();

        System.out.println(laptop.charge());
        System.out.println(refrigerator.startCooling());
        System.out.println(smartphone.chargePhone());
    }
}
