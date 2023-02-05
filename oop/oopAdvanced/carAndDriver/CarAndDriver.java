public class CarAndDriver {

    public static void main(String[] args) {
        Car car1 = new Car();
        Driver d = new Driver();
        System.out.println(car1.getGas());
        d.drive();
        d.drive();
        d.drive();
        d.drive();

        d.boost();

        d.refuel();
        d.refuel();
        d.refuel();
    }
    
}
