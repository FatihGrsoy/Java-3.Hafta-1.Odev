public class Person extends Customer{
    String firstName;
    String lastName;
    String nationalIdentity;

    public String getNationalIdentity() {
        return nationalIdentity;
    }
    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
