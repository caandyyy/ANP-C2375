package question2.main;

import question2.thread.ThankYou;
import question2.thread.Welcome;

public class Main {
	public static void main(String args[]){

        Thread welcome = new Welcome();
        Thread thankyou = new ThankYou();
        welcome.start();
        thankyou.start();
     
        
      
      
}
	

}
