package DoctorRunnable2;

public class Main {
	
	public static void main(String[] args) {
        Doctor doctor = new Doctor(); // Un solo objeto compartido
        
        int numThreads = 4; // Puedes cambiarlo a 99 si quieres
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(doctor);
            threads[i].start();
        }

        // Esperamos a que todos los hilos terminen
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Valor final del contador: " + Doctor.getContador());
    }

}
