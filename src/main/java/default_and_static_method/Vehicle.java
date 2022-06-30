package default_and_static_method;

public interface Vehicle {
    default void print() {
        System.out.println("I am a vehicle!");
    }

    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }

    void vehicleType();
}

class Car implements Vehicle {

    public void print() {
        Vehicle.super.print(); // while refereing to default method of interface use super keyword
    }

    public void blowHorn() {
        Vehicle.blowHorn();
    }

    @Override
    public void vehicleType() {
        System.out.println("I am Car!");
    }
}
