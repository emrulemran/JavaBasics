package javalecture;

public class SwitchDemo {

	public static void main(String[] args) {
	String color = "Green";
	
	switch (color) {
	case "Green":
		System.out.println("Go ahead - if clear");		
		break;

	case "Yellow":
		System.out.println("Proceed with caution");		
		break;

	case "Red":
		System.out.println("STOP");		
		break;
		
	default: System.out.println("Invalid color - obey the officer!");
		break;
	}
	
	}

}
