package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Olio-ohjelmointi viikko 6, periytyminen
 * Veikko Vanninen
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner selection = new Scanner(System.in);

        /* Car car = null;
        Plane plane = null;
        Ship ship = null; */

        ArrayList<Vehicle> Vehicles = new ArrayList<>();

        boolean exit = false;
        while(!exit) {
            
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            
            if(selection.hasNext()) {
                int i = 0;
                String stringInput = selection.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                        if(selection.hasNext()) {
                            int j = 0;
                            String stringInput2 = selection.nextLine();
                            j = Integer.parseInt(stringInput2);

                            switch(j) {
                                case 1:
                                    System.out.println("Anna kulkuneuvon valmistaja:");
                                    String carManufacturer = selection.nextLine();
                                    System.out.println("Anna kulkuneuvon malli:");
                                    String carModel = selection.nextLine();
                                    System.out.println("Anna kulkuneuvon huippunopeus:");
                                    String carMaxSpeedString = selection.nextLine();
                                    int carMaxSpeed = Integer.parseInt(carMaxSpeedString);
                                    Vehicle vehicleCar = new Car(carManufacturer, carModel, carMaxSpeed);
                                    Vehicles.add(vehicleCar);
                                    break;
                                case 2:
                                    System.out.println("Anna kulkuneuvon valmistaja:");
                                    String planeManufacturer = selection.nextLine();
                                    System.out.println("Anna kulkuneuvon malli:");
                                    String planeModel = selection.nextLine();
                                    System.out.println("Anna kulkuneuvon huippunopeus:");
                                    String planeMaxSpeedString = selection.nextLine();
                                    int planeMaxSpeed = Integer.parseInt(planeMaxSpeedString);
                                    Vehicle vehiclePlane = new Plane(planeManufacturer, planeModel, planeMaxSpeed);
                                    Vehicles.add(vehiclePlane);
                                    break;
                                case 3:
                                    System.out.println("Anna kulkuneuvon valmistaja:");
                                    String shipManufacturer = selection.nextLine();
                                    System.out.println("Anna kulkuneuvon malli:");
                                    String shipModel = selection.nextLine();
                                    System.out.println("Anna kulkuneuvon huippunopeus:");
                                    String shipMaxSpeedString = selection.nextLine();
                                    int shipMaxSpeed = Integer.parseInt(shipMaxSpeedString);
                                    Vehicle vehicleShip = new Ship(shipManufacturer, shipModel, shipMaxSpeed);
                                    Vehicles.add(vehicleShip); 
                                    break;
                                default:
                                    System.out.println("Syöte oli väärä");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        for (Vehicle vehicle : Vehicles) {
                            vehicle.printSpecs();                         
                        }
                        break;
                    case 3:
                        for (Vehicle vehicle : Vehicles) {
                            if (vehicle instanceof Car) {
                                ((Car)vehicle).drive();
                            }
                        }
                        break;
                    case 4:
                        for (Vehicle vehicle : Vehicles) {
                            if (vehicle instanceof Plane) {
                                ((Plane)vehicle).fly();
                            }
                        }
                        break;
                    case 5:
                        for (Vehicle vehicle : Vehicles) {
                            if (vehicle instanceof Ship) {
                                ((Ship)vehicle).sail();
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
        selection.close();
    }
}
