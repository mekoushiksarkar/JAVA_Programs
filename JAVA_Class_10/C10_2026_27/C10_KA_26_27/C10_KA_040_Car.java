/* Car.java */
class Vehicle
{
    String vehicleType;
    Vehicle()
    {
        vehicleType = "N/A";
    }
    void set(String vt)
    {
        vehicleType = vt;
    }
    void show()
    {
        System.out.println("The vehicle type is: " + vehicleType);
    }
}
public class Car extends Vehicle
{
    String modelType;
    Car()
    {
        modelType = "N/A";
    }
    void set(String vt, String mt)
    {
        super.set(vt);
        modelType = mt;
    }
    void show()
    {
        super.show();
        System.out.println("The model type is: " + modelType);
    }
    public static void main(String args[])
    {
        Vehicle objVehicle1 = new Vehicle();
        System.out.println("Vehicle with N/A values");
        objVehicle1.show();
        System.out.println();
        Vehicle objVehicle2 = new Vehicle();
        System.out.println("Vehicle with assigned values");
        objVehicle2.set("Car");
        objVehicle2.show();
        System.out.println();
        Car objCar1 = new Car();
        System.out.println("Car with N/A values");
        objCar1.show();
        System.out.println();
        Car objCar2 = new Car();
        System.out.println("Car with assigned values");
        objCar2.set("Car", "Mercedes C Class");
        objCar2.show();
    }
}