import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

    User user1;


    @Before
    public void setUp() throws Exception {


        user1 = new User("Dima", "Kleh", "fdjfjdnjfduj12", "12/2/09", "446565565");

    }

    @Test
    public void  getAddressTest() {
        assertEquals("fdjfjdnjfduj12",user1.getAddress());
    }

    @Test
    public void setAddressTest() {
        user1.setAddress("jjjnjn12");
        assertEquals("jjjnjn12",user1.getAddress());
    }

    @Test
    public void getNameTest() {
        assertEquals("Dima",user1.getName());
    }

    @Test
    public void setNameTest() {
        user1.setName("Bob");
        assertEquals("Bob",user1.getName());
    }

    @Test
    public void getSurnameTest() {
        assertEquals("Kleh",user1.getSurname());
    }

    @Test
    public void setSurnameTest() {
        user1.setSurname("Klen");
        assertEquals("Klen",user1.getSurname());
    }

    @Test
    public void getDobTest() {
        assertEquals("12/2/09",user1.getDob());
    }

    @Test
    public void setDobTest() {
        user1.setDob("11/9/02");
        assertEquals("11/9/02",user1.getDob());
    }

    @Test
    public void getMedicalCardNumberTest() {
        assertEquals("446565565",user1.getMedicalCardNumber());
    }

    @Test
    public void setMedicalCardNumberTest() {
        user1.setMedicalCardNumber("446523989");
        assertEquals("446523989",user1.getMedicalCardNumber());
    }

}
