package java1toll;


public class App {

    public static void main(String[] args) {


        Parking[] vehicle = new Parking[10];

        BikeParking bike = new BikeParking();
        CarParking car = new CarParking();
        TruckParking truck = new TruckParking();

        vehicle[0] = car;
        vehicle[1] = bike;
        vehicle[2] = truck;
        vehicle[3] = car;
        vehicle[4] = bike;
        vehicle[5] = truck;
        vehicle[6] = car;
        vehicle[7] = bike;
        vehicle[8] = truck;
        vehicle[9] = car;

        int totalToll = 0;


        for(int i=0; i<vehicle.length; i++) {

            vehicle[i].toll();

            if(vehicle[i] instanceof BikeParking) {
                totalToll += 20;
            }

            else if(vehicle[i] instanceof CarParking) {
                totalToll += 50;
            }

            else if(vehicle[i] instanceof TruckParking) {
                totalToll += 100;
            }
        }


        System.out.println("\nTotal Bikes: " + bike.count);
        System.out.println("Total Cars: " + car.count);
        System.out.println("Total Trucks: " + truck.count);

        System.out.println("Total Toll Collection: " + totalToll);
    }
}