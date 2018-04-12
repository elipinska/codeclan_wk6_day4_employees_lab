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
    public void adminHasName() {
        assertEquals("Mark", developer1.getName());
    }

    @Test
    public void adminHasNin() {
        assertEquals("QQ123456C", developer1.getNin());
    }

    @Test
    public void adminHasSalary() {
        assertEquals(24000.0, developer1.getSalary(), 0.01);
    }

}

