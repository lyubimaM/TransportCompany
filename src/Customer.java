public class Customer extends Human{
    private Address address;
    private String phone_number;

    public Customer(String fname, String lname, Integer age, String EGN, Address address, String phone_number) {
        super(fname, lname, age, EGN);
        this.address = address;
        this.phone_number = phone_number;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    @Override
    public String toString() {
        return "Customer{" + super.toString()
                + "address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                "} ";
    }
}
