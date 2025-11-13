package modul_6.praktikum_2;

public class OverrideTest {
    public static void main(String[] args) {
        Car car = new Car("Mazda", 250, 4);

        // Memanggil overridden method
        car.start();
        car.displayInfo();
        car.honk();

        // Demonstrasi polymorphism
        Vehicle vehicle = new Car("Porshe", 1000, 2);
        vehicle.start(); // Memanggil method yang di-override
        vehicle.displayInfo(); // Memanggil method yang di-override
    }
}