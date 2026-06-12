package java1toll;


public class TruckParking extends Parking {

    int count = 0;
    int tollAmount = 100;

    @Override
    void toll() {
        count++;
        System.out.println("Truck toll: " + tollAmount);
    }
}
