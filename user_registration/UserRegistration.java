package user_registration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {

	public static void userValidation() {
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.println("enter option to validate\n 1.FirstName:");
			int option = scanner.nextInt();
			scanner.nextLine();
			switch (option) {
			case 1:
				final String FIRSTNAME = "([A-Z]{1}[a-zA-Z]{3,})";
				System.out.println("enter firstname:");
				String firstName = scanner.next();
				boolean result = Pattern.matches(FIRSTNAME, firstName);
				System.out.println(result);
				if (result == false) {
					System.out.println("enter valid firstname:");
					break;
				}
			default:
				check = false;
				break;
			}
		}
	}

	public static void main(String[] args) {
		userValidation();
	}
}