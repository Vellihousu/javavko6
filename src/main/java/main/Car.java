package main;

public class Car extends Vehicle{

    public Car(String manufacturer, String model, int maxSpeed) {
        super("Auto", manufacturer, model, maxSpeed);

        int i = 1;
        while(i-- > 0) {
            engines.add(new Engine("V8", 300));
        }
    }

    public void drive() {
        System.out.println(manufacturer + " " + model + " paahtaa tietä eteenpäin!");
    }    
}
