import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DoctorTest {
    Doctor doc = new Doctor("Dima", "Kleh", "fdjfjdnjfduj12", "12/2/09", "446565565","12334");

    @Test
    public void setMedicalCertificateNumberTest() {
        assertEquals("12334",doc.getMedicalCertificateNumber());
    }

    @Test
    public void getMedicalCertificateNumberTest(){
        doc.setMedicalCertificateNumber("09876");
        assertEquals("09876",doc.getMedicalCertificateNumber());
    }
}
