package java1toll;


public class BikeParking extends Parking {

    int count = 0;
    int tollAmount = 20;

    @Override
    void toll() {
        count++;
        System.out.println("Bike toll: " + tollAmount);
    }
}