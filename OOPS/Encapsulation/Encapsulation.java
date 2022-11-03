package Encapsulation;

public class Encapsulation {

    private int RollNumber = 12;
    private String name = "Hareesh";
    private int Year = 2022;

    public String SetName(String name){
        return this.name = name;
    }

    public int GetYear(){
        return Year;
    }
    public int GetRollNumber(){
        return RollNumber;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        System.out.println(obj.GetRollNumber());
        System.out.println(obj.GetYear()); //We can access value with getter function
        System.out.println(obj.SetName("Prince")); //we can set the name with setter function
    }
}
