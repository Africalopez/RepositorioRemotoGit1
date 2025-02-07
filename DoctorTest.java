package DoctorRunnable2;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DoctorTest {

	  @Test
	    public void testContador() throws InterruptedException {
	        Doctor doctor = new Doctor();
	        Thread[] threads = new Thread[10];

	        for (int i = 0; i < 10; i++) {
	            threads[i] = new Thread(doctor);
	            threads[i].start();
	        }

	        for (int i = 0; i < 10; i++) {
	            threads[i].join();
	        }

	        assertTrue(Doctor.getContador() > 0);
	    }
}
