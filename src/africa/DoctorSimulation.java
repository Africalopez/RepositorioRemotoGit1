package africa;

public class DoctorSimulation {
	
	public static void main(String[] args) {
		
		 Doctor doctor1 = new Doctor("Doctor Ramon" ,5, "stomag");
		 Doctor doctor2 = new Doctor("Doctor James" ,10, "head");
		 Doctor doctor3 = new Doctor("Doctor Nacho" ,3, "arm");
				
				
		doctor1.start();
		doctor2.start();
		doctor3.start();
		
		//Main continues
		System.out.println("All doctors are checking their patients....");
				
	}

}
