package java1FoodDelivery;


public class Main {

    public static void main(String[] args) {
        Delivery d;

        d= new Bike();
        d.deliver();

        d = new Cycle();
        d.deliver();

        d = new Air();
        d.deliver();
         
    }
}