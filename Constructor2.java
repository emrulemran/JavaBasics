package testcodes;

public class Constructor2 {

	
	Constructor2(){
		this(100);
		System.out.println("cons1");
	}
	
	
	Constructor2(int x){
		
		System.out.println("cons2");		
	}
	public static void main(String[] args) {
		Constructor2 cobj = new Constructor2();

	}

}
