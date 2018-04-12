import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer1;

    @Before
    public void before() {
        developer1 = new Developer("Sofia", "QQ123456C", 26000);

    }

    @Test
    public void developerHasName() {
        assertEquals("Sofia", developer1.getName());
    }

    @Test
    public void developerHasNin() {
        assertEquals("QQ123456C", developer1.getNin());
    }

    @Test
    public void developerHasSalary() {
        assertEquals(26000.0, developer1.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary() {
        developer1.raiseSalary(3);
        assertEquals(26780.0, developer1.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(260.0, developer1.payBonus(), 0.01);
    }

}

