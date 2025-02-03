package africa;

public class Doctor extends Thread{
	
	private String doctorName;
	private int treatingTime;
	private String problem;
	
	public Doctor (String doctorName, int treatingTime, String problem) {
		this.doctorName = doctorName;
		this.treatingTime = treatingTime;
		this.problem = problem;
	}
	
	@Override
	public void run() {
		System.out.println(doctorName + "started checking patient: " + problem);
		try {
			//Sleeps for trating time
			Thread.sleep(treatingTime * 1000L);
		} catch (InterruptedException e) {
			System.out.println(doctorName + "was interrumpted while checking patient: " + problem);
			Thread.currentThread().interrupt();
		}
		System.out.println(doctorName + "finished checking patient" + problem);
	}

}
