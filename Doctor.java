package DoctorRunnable2;

import java.util.concurrent.atomic.AtomicInteger;

public class Doctor implements Runnable{
	
    private static AtomicInteger contador = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            contador.incrementAndGet();
        }
        System.out.println(Thread.currentThread().getName() + " - Contador: " + contador.get());
    }

    public static int getContador() {
        return contador.get();
    }

}
