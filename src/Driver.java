public class Driver {
   private String EGN;
   private String fname;
   private String lname;
   private Qualification qualification;

   public Driver(String EGN, String fname, String lname, Qualification qualification) {
      this.EGN = EGN;
      this.fname = fname;
      this.lname = lname;
      this.qualification = qualification;
   }

   public String getEGN() {
      return EGN;
   }

   public String getFname() {
      return fname;
   }

   public String getLname() {
      return lname;
   }

   public Qualification getQualification() {
      return qualification;
   }

   @Override
   public String toString() {
      return "Driver{" +
              "EGN='" + EGN + '\'' +
              ", fname='" + fname + '\'' +
              ", lname='" + lname + '\'' +
              ", qualification=" + qualification +
              '}';
   }
}
