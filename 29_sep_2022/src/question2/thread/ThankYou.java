package question2.thread;

public class ThankYou extends Thread {
	public void run() {
		for(int i=0;i<3;i++) {
			
			System.out.println("Thank You");
	    	 try {
				sleep(400);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}
	}

}
