//DEFINE THREE METHODS -Start(),displayinstruction(),exit,     define main method with local variable menuinput with int value and call method or write not a valid input


public class Demo {
//	method
	void start() {
		System.out.println("start");
	}
	void displayinstruction() {
		System.out.println("display");
		
	}
	void exit() {
		System.out.println("exited");
	}
	public static void main(String[] args) {
		
		Demo obj=new Demo();
		int input=9;
		switch(input) {
		case 1:
			obj.start();
			System.out.println("start");
			break;
		case 2:
			obj.displayinstruction();
			System.out.println("display");
			break;
		case 3:
			obj.exit();
			System.out.println("exit");
			break;
		default :
			System.out.println("not a valid output");
			break;
		

		
		}
	
		
		
		
	}
	
	
}
