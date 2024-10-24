package q1;

import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class Teater {

    Worker worker = new Worker("Money", 1);
    Supervisor supervisor = new Supervisor("Cyber", 1, "Terror");
    Director director = new Director("Battle", 1, "Necessary");

    @Test
    public void testWorker() {
        assertEquals("Money", worker.getName());
        assertEquals(1, worker.getWage());
        worker.setName("Modified Money");
        worker.setWage(1.2);
        assertEquals("Modified Money", worker.getName());
        assertEquals(1.2, worker.getWage());
    }

    @Test
    public void testSupervisor () {
        assertEquals("Cyber", supervisor.getName());
        assertEquals(1, supervisor.getWage());
        assertEquals("Terror", supervisor.getDivision());
        supervisor.setName("Modified Cyber");
        supervisor.setWage(1.2);
        supervisor.setDivision("IT");
        assertEquals("Modified Cyber", supervisor.getName());
        assertEquals(1.2, supervisor.getWage());
        assertEquals("IT", supervisor.getDivision());

    }

    @Test
    public void testDirector() {
        assertEquals("Battle", director.getName());
        assertEquals(1, director.getWage());
        assertEquals("Necessary", director.getDivision());
        director.setName("Modified Battle");
        director.setWage(1.2);
        director.setDivision("IT");
        assertEquals("Modified Battle", director.getName());
        assertEquals(1.2, director.getWage());
        assertEquals("IT", director.getDivision());

    }
}
