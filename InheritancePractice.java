package Java;
//Superclass definition
class Vehicle
{
    public Vehicle()
    {
        System.out.println("4 Wheels");
    }
}
//Subclass definition
class ElectricVehicle extends Vehicle
{
    public ElectricVehicle()
    {
        System.out.print("Tesla ");
    }
}


public class InheritancePractice 
{
    public static void main(String[] args)
    {
        //declare and output a super class object
        Vehicle gasVehicle = new Vehicle();
        System.out.print(gasVehicle);
        System.out.println();
        //declare and output a sub class object
        ElectricVehicle Ford = new ElectricVehicle();
        System.out.print(Ford);
        System.out.println();
    }
}
