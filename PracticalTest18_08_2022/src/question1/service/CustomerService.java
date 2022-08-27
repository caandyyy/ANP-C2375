package question1.service;

import question1.model.Customer;

public class CustomerService {
	public boolean checkEligibility(Customer custObj1) {
		
		if(custObj1.getCage()>=18) {
			return true;
		}
		return false;
	}

}