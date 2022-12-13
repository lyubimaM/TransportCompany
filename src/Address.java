public class Address {
    private String country;
    private String city;
    private String street;
    private String street_number;

    public Address(String country, String city, String street, String street_number) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.street_number = street_number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", street_number='" + street_number + '\'' +
                '}';
    }
}
