public class Driver extends Employee{
    private String driver_phonenumber;

    public Driver(String fname, String lname, Integer age, String EGN, Qualification qualification, Position position, Integer experience_years, String driver_phonenumber) {
        super(fname, lname, age, EGN, qualification, position, experience_years);
        this.driver_phonenumber = driver_phonenumber;
    }

    public String getDriver_phonenumber() {
        return driver_phonenumber;
    }

    public void setDriver_phonenumber(String driver_phonenumber) {
        this.driver_phonenumber = driver_phonenumber;
    }

    @Override
    public String toString() {
        return "Driver{" + super.toString()
                + "driver_phonenumber='" + driver_phonenumber + '\'' +
                "} ";
    }
}
