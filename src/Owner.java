import java.util.TreeSet;

public class Owner extends Human{
    private TreeSet<Company> companies;
    private String Owner_phonenumber;
    private Address Owner_address;

    public Owner(String fname, String lname, Integer age, String EGN, TreeSet<Company> companies, String owner_phonenumber, Address owner_address) {
        super(fname, lname, age, EGN);
        this.companies = companies;
        Owner_phonenumber = owner_phonenumber;
        Owner_address = owner_address;
    }

    public TreeSet<Company> getCompanies() {
        return companies;
    }

    public String getOwner_phonenumber() {
        return Owner_phonenumber;
    }

    public Address getOwner_address() {
        return Owner_address;
    }

    public void setOwner_phonenumber(String owner_phonenumber) {
        Owner_phonenumber = owner_phonenumber;
    }

    public void setOwner_address(Address owner_address) {
        Owner_address = owner_address;
    }
}
