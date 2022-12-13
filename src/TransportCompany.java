import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TransportCompany extends Company implements Income, Expense{
    private List<Vehicle> vehicles;
    private List<Employee> employees;
    private List<Customer> customers;

    public TransportCompany(String company_name, Address address, TreeSet<Owner> owners, List<Vehicle> vehicles, List<Employee> employees, List<Customer> customers) {
        super(company_name, address, owners);
        this.vehicles = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.customers = new ArrayList<>();
    }


    @Override
    public Double Expense() {
        return null;
    }

    @Override
    public Double Income() {
        return null;
    }
}
