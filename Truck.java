public class Truck extends Vehicle{
    public Truck(String make, String model, int year){
        super(make, model, year);
    }
    public void displayType(){
        System.out.print("This is a truck.");
    }
}
