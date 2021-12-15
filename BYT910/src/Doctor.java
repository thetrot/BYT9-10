public class Doctor extends Nurse {
    private String medicalCertificateNumber;
    public Doctor(String name, String surname, String address, String dob, String medicalCardNumber, String medicalCertificateNumber) {
        super(name, surname, address, dob, medicalCardNumber);
        this.medicalCertificateNumber = medicalCertificateNumber;
    }

    public void setMedicalCertificateNumber(String medicalCertificateNumber) {
        this.medicalCertificateNumber = medicalCertificateNumber;
    }

    public void getMedicalCertificateNumber(){

    }
}
