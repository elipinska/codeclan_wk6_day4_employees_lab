import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director1;

    @Before
    public void before() {
        director1 = new Director("Jacq", "QQ123456C", 40000.00, "Knowledge Exchange", 250000.00);
    }

    @Test
    public void directorHasName() {
        assertEquals("Jacq", director1.getName());
    }

    @Test
    public void directorHasNin() {
        assertEquals("QQ123456C", director1.getNin());
    }

    @Test
    public void directorHasSalary() {
        assertEquals(40000.00, director1.getSalary(), 0.01);
    }

    @Test
    public void directorHasDepartment() {
        assertEquals("Knowledge Exchange", director1.getDeptName());
    }

    @Test
    public void raiseSalary() {
        director1.raiseSalary(3);
        assertEquals(41200.0, director1.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(800.0, director1.payBonus(), 0.01);
    }

    @Test
    public void directorHasBudget() {
        assertEquals(250000, director1.getBudget(), 0.01);
    }
}