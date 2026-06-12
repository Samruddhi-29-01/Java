package java1toll;


public class CarParking extends Parking {

    int count = 0;
    int tollAmount = 50;

    @Override
    void toll() {
        count++;
        System.out.println("Car toll: " + tollAmount);
    }
}