import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MedicineTest {

    Medicine med = new Medicine("gfgffr", 545454, 2323232, new GregorianCalendar(2025, 11, 9));

    @Test
    public void getName() {
        assertEquals("gfgffr", med.getName());
    }

    @Test
    public void setName() {
        med.setName("fdfddg");
        assertEquals("fdfddg", med.getName());

    }

    @Test
    public void getCertificateNumber() {
        assertEquals(545454, med.getCertificateNumber());
    }

    @Test
    public void setCertificateNumber() {
        med.setCertificateNumber(33346);
        assertEquals(33346, med.getCertificateNumber());

    }

    @Test
    public void getSeries() {
        assertEquals(2323232, med.getSeries());
    }

    @Test
    public void setSeries() {
        med.setSeries(686868);
        assertEquals(686868, med.getSeries());

    }

    @Test
    public void getExpirationDate() {
        assertEquals(new GregorianCalendar(2025, 11, 9), med.getExpirationDate());
    }

    @Test
    public void setExpirationDate() {
        med.setExpirationDate(new GregorianCalendar(2024, 11, 9));
        assertEquals(new GregorianCalendar(2024, 11, 9), med.getExpirationDate());

    }
}
