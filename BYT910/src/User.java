public class User {

    private String name;
    private String surname;
    private String address;
    private String dob;
    private String medicalCardNumber;

    public User(String name, String surname, String address, String dob, String medicalCardNumber){
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.dob = dob;
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(String medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public void login(){

    }
}
