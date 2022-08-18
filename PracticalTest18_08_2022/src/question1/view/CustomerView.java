package question1.view;

import question1.model.Customer;
import question1.service.CustomerService;

public class CustomerView {

	public static void main(String[] args) {
		Customer CustObj = new Customer(1,"anu",3);
		CustomerService customerservice = new CustomerService();
		boolean eligible=customerservice.checkEligibility(CustObj);
		
		
		if(eligible==true) {
			System.out.println("you are eligible for voting");
		}
		else {
			System.out.println("you are not eligible for voting");
		}	
		
	}
}