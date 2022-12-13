import java.util.TreeSet;

public class Company {
    private String company_name;
    private Address address;
    private TreeSet<Owner> owners;

    public Company(String company_name, Address address, TreeSet<Owner> owners) {
        this.company_name = company_name;
        this.address = address;
        this.owners = owners;
    }

    public String getCompany_name() {
        return company_name;
    }

    public Address getAddress() {
        return address;
    }

    public TreeSet<Owner> getOwners() {
        return owners;
    }

    public void setOwners(TreeSet<Owner> owners) {
        this.owners = owners;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company_name='" + company_name + '\'' +
                ", address=" + address +
                ", owners=" + owners +
                '}';
    }
}
