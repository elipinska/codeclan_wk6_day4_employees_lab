import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager1;

    @Before
    public void before() {
        manager1 = new Manager("Ewa", "QQ123456C", 27000.00, "Research");
    }

    @Test
    public void managerHasName() {
        assertEquals("Ewa", manager1.getName());
    }

    @Test
    public void managerHasNin() {
        assertEquals("QQ123456C", manager1.getNin());
    }

    @Test
    public void managerHasSalary() {
        assertEquals(27000.00, manager1.getSalary(), 0.01);
    }

    @Test
    public void managerHasDepartment() {
        assertEquals("Research", manager1.getDeptName());
    }

    @Test
    public void raiseSalary() {
        manager1.raiseSalary(3);
        assertEquals(27810.0, manager1.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(270.0, manager1.payBonus(), 0.01);
    }
}
