public class VehicleTest {
    public static void main(String [] args){
        Car car1 = new Car("Kia", "Forte EX", 2019);
        Car car2 = new Car("Nissan", "Gtr Skyline", 2008);
        Truck truck1 = new Truck("Ford", "F-150", 2019);
        Truck truck2 = new Truck("Dodge", "Ram 1500", 2015);
        car1.displayInfo();
        System.out.println();
        car1.displayType();
        System.out.println();
        System.out.println();
        car2.displayInfo();
        System.out.println();
        car2.displayType();
        System.out.println();
        System.out.println();
        truck1.displayInfo();
        System.out.println();
        truck1.displayType();
        System.out.println();
        System.out.println();
        truck2.displayInfo();
        System.out.println();
        truck2.displayType();
        System.out.println();
        System.out.println();
        car1.setYear(1999);
        car1.getYear();
        car1.displayInfo();
    }
}
