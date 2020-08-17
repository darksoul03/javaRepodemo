package inputoutput;

import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Number: ");
		System.out.println("Number is :"+ input.nextInt());
		
		System.out.println("Enter a text: ");
		System.out.println("Name is "+ input.next());
		input.close();
	}

}
