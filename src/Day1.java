import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {

		System.out.println("Welcome to Day 1 of Java Coding");
		
		//Here we will just take the input from the user and display it on the screen.
		Scanner sc = new Scanner(System.in);
		
		String name=sc.nextLine();
		int age= sc.nextInt();
		sc.nextLine(); //added to clear the buffer otherwise next line will not be printed.
		String surname=sc.nextLine();
		
		//Print the input
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The surname is "+surname);
		
	}

}
