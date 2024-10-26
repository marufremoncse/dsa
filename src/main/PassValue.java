package main;

public class PassValue {

	public static void main(String[] args) {
		int x = 10;
		passValue(x);
		
		System.out.println(x);
	}
	
	public static void passValue(int x) {
		x=15;
	}

}
