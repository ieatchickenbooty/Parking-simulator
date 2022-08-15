package aEK;

public class Vehicle extends irmao{
    private String vehName;
    private String make;
    private int year;
    private String color;

    public Vehicle() {
    }

    public void setVehName(String vehName) {
        this.vehName = vehName;
    }

    public String getVehName() {
        return vehName;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return  color;
    }
    public void setYear(int year){
        this.year = year;
    }public int getYear(){
        return year;
    }
    @Override
   public String toString(){
        return "Vehicle Model: "+vehName + "Vehicle Make: " + make + "Vehicle color: " + color + "Vehicle year: " + year + "\n";

    }
}


