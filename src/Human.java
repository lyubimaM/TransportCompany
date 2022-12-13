public class Human {
    private String fname;
    private String lname;
    private Integer age;
    private String EGN;

    public Human(String fname, String lname, Integer age, String EGN) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.EGN = EGN;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Integer getAge() {
        return age;
    }

    public String getEGN() {
        return EGN;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", EGN='" + EGN + '\'' +
                '}';
    }
}
