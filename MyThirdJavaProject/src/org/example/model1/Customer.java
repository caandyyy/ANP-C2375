package org.example.model1;
public class Customer 
{
	
	private int customerId;
	private String customerName;
	public Customer()
	{
	} 
  public Customer (int customerId,String customerName)//constructor with parameter
	{
		this.customerId = customerId;
		this.customerName=customerName;
	}
	
	public int getCustomerId()//defining method
	{
		return  customerId;
	}
	public void setCustomerId(int customerId)//parameter with datatype
	{
		this.customerId=customerId;
	}
	public String getCustomerName()
	{
		return customerName;
    }
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
}