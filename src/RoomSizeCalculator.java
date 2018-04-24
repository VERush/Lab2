
import java.util.Scanner;

public class RoomSizeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		double length;
		double width;
		String entry;
		String cont = "y";

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println(" ");

		do {
			System.out.print("Enter Length: ");
			entry = input.nextLine();
			length = Double.parseDouble(entry);

			System.out.print("Enter Width: ");
			entry = input.nextLine();
			width = Double.parseDouble(entry);

			System.out.println("Area: " + 2 * (length + width));
			System.out.println("Perimeter: " + (length * width));

			System.out.println("Continue? (y/n): ");
			cont = input.nextLine();

		} while (cont.equalsIgnoreCase("y"));

		input.close();

	}

}
