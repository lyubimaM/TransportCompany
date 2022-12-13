import java.util.List;

public class Vehicle {
    private TypeVehicle typeVehicle;// truck, taxi, train ...
    private Integer power;// horse force
    private String regNumber;//register number - CB3456HK
    private List<Driver> driver;

    public Vehicle(TypeVehicle typeVehicle, Integer power, String regNumber, java.util.List<Driver> driver) {
        this.typeVehicle = typeVehicle;
        this.power = power;
        this.regNumber = regNumber;
        this.driver = driver;
    }

    public TypeVehicle getTypeVehicle() {
        return typeVehicle;
    }

    public Integer getPower() {
        return power;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public List<Driver> getDriver() {
        return driver;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setDriver(List<Driver> driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "typeVehicle=" + typeVehicle +
                ", power=" + power +
                ", regNumber='" + regNumber + '\'' +
                ", driver=" + driver +
                '}';
    }
}
