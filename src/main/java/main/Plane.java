package main;

public class Plane extends Vehicle{

    public Plane(String manufacturer, String model, int maxSpeed) {
        super("Lentokone", manufacturer, model, maxSpeed);
        int i = 1;
        while(i-- > 0) {
            engines.add(new Engine("Suihkumoottori", 500));
        }
    }

    public void fly() {
        System.out.println(manufacturer + " " + model + " lentää kohteeseen!");
    } 
    
}
