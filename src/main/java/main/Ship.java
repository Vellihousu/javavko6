package main;

public class Ship extends Vehicle{
    protected String engineName;
    protected int enginePower;

    public Ship(String manufacturer, String model, int maxSpeed) {
        super("Laiva", manufacturer, model, maxSpeed);
        int i = 1;
        while(i-- > 0) {
            engines.add(new Engine("Wärtsilä Super", 1000));
        }
    }

    public void sail() {
        System.out.println(manufacturer + " " + model + " seilaa merten ääriin!");
    } 

}
