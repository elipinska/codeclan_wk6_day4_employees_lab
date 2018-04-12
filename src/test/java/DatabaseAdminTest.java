import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin admin1;

    @Before
    public void before() {
        admin1 = new DatabaseAdmin("Mark", "QQ123456C", 24000);

    }

    @Test
    public void adminHasName() {
        assertEquals("Mark", admin1.getName());
    }

    @Test
    public void adminHasNin() {
        assertEquals("QQ123456C", admin1.getNin());
    }

    @Test
    public void adminHasSalary() {
        assertEquals(24000.0, admin1.getSalary(), 0.01);
    }

    @Test
    public void raiseSalary() {
        admin1.raiseSalary(3);
        assertEquals(24720.0, admin1.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(240.0, admin1.payBonus(), 0.01);
    }

}
