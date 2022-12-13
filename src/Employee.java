import java.util.List;

public class Employee extends Human{
    private Qualification qualification;
    private Position position;
    private Integer experience_years;
    private Double salary;

    public Employee(String fname, String lname, Integer age, String EGN, Qualification qualification, Position position, Integer experience_years, Double salary) {
        super(fname, lname, age, EGN);
        this.qualification = qualification;
        this.position = position;
        this.experience_years = experience_years;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Position getPosition() {
        return position;
    }

    public Integer getExperience_years() {
        return experience_years;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setExperience_years(Integer experience_years) {
        this.experience_years = experience_years;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()
                + "position=" + position +
                ", experience_years=" + experience_years +
                "} ";
    }
}
