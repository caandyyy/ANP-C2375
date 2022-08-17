package org.example.view1;
import org.example.model1.Customer;

public class MainView {
	int getCustomerIdFromCustomer(Customer custObj)
	{
			int custId=custObj.getCustomerId();// calling method
			return custId;
			
	}
	String getCustomerNameFromCustomer(Customer custObj1)
	{
		String custName=custObj1.getCustomerName();
		return custName;
	}
     public static void main(String[] args) 
		{
			Customer customer1=new Customer(1,"Samiksha");//object creation
			MainView mainViewObj=new MainView();//object creation
			MainView mainViewObj1=new MainView();
			
			int custId=mainViewObj.getCustomerIdFromCustomer(customer1); // calling the method
			System.out.println("The customer id: "+custId);
			
			int id=customer1.getCustomerId();
			System.out.println(id);
			
			String custName=mainViewObj1.getCustomerNameFromCustomer(customer1);
		    System.out.println("The customer name :"+custName);
		    
		   
		    
		}

}
