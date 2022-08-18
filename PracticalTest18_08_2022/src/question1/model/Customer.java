package question1.model;

public class Customer {
	private int id;   //member variable
	private String name;
	private int age;
	public Customer() {
		//empty constructor
	}
	public Customer(int Cid,String Cname,int Cage) {
		id=Cid;
		name=Cname;
		age=Cage;
		
		
	}
	public int getCid() {
		return id;
	}
	public void setCid(int Cid) {
		id=Cid;
	}
	public String getCname() {
		return name;
	}
	public void setCname(String Cname) {
		name=Cname;
	}
	public int getCage() {
		return age;
	}
	public void setCage(int Cage) {
		age=Cage;
	}

}
