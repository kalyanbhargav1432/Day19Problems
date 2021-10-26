package user_registration;

import java.util.regex.*;

public class SampleEmails {
	public static void userValidation() {
		final String EMAIL = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

		boolean result1 = Pattern.matches(EMAIL, "abc@yahoo.com");
		System.out.println("1. abc@yahoo.com" + " :" + result1);

		boolean result2 = Pattern.matches(EMAIL, "abc-100@yahoo.com");
		System.out.println("2. abc-100@yahoo.com" + " :" + result2);

		boolean result3 = Pattern.matches(EMAIL, "abc.100@yahoo.com");
		System.out.println("3. abc.100@yahoo.com" + ":" + result3);

		boolean result4 = Pattern.matches(EMAIL, "abc111@abc.com");
		System.out.println("4. abc111@abc.com" + ":" + result4);

		boolean result5 = Pattern.matches(EMAIL, "abc-100@abc.net");
		System.out.println("5. abc-100@abc.net" + ":" + result5);

		boolean result6 = Pattern.matches(EMAIL, "abc.100@abc.com.au");
		System.out.println("6. abc.100@abc.com.au" + ":" + result6);

		boolean result7 = Pattern.matches(EMAIL, "abc@1.com");
		System.out.println("7. abc@1.com" + ":" + result7);

		boolean result8 = Pattern.matches(EMAIL, "abc@gmail.com.com");
		System.out.println("8. abc@gmail.com.com" + ":" + result8);

		boolean result9 = Pattern.matches(EMAIL, "abc+100@gmail.com");
		System.out.println("9. abc+100@gmail.com" + ":" + result9);

		System.out.println("\ninvalid emails\n");

		boolean result10 = Pattern.matches(EMAIL, "abc");
		System.out.println("1. abc" + ":" + result10);

		boolean result11 = Pattern.matches(EMAIL, "abc@.com.my");
		System.out.println("2. abc@.com.my" + ":" + result11);

		boolean result12 = Pattern.matches(EMAIL, "abc123@gmail.a");
		System.out.println("3. abc123@gmail.a" + ":" + result12);

		boolean result13 = Pattern.matches(EMAIL, "abc123@.com");
		System.out.println("4. abc123@.com" + ":" + result13);

		boolean result14 = Pattern.matches(EMAIL, "abc123@.com.com");
		System.out.println("5. abc123@.com.com" + ":" + result14);

		boolean result15 = Pattern.matches(EMAIL, "abc@abc.com");
		System.out.println("6. abc@abc.com." + ":" + result15);

		boolean result16 = Pattern.matches(EMAIL, "abc()*@gmail.com");
		System.out.println("7. abc()*@gmail.com" + ":" + result16);

		boolean result17 = Pattern.matches(EMAIL, "abc@%*.com");
		System.out.println("8. abc@%*.com" + ":" + result17);

		boolean result18 = Pattern.matches(EMAIL, "abc..2002@gmail.com");
		System.out.println("9. abc..2002@gmail.com" + ":" + result18);

		boolean result19 = Pattern.matches(EMAIL, "abc.@gmail.com");
		System.out.println("10. abc.@gmail.com" + ":" + result19);

		boolean result20 = Pattern.matches(EMAIL, "abc@abc@gmail.com");
		System.out.println("11. abc@abc@gmail.com" + ":" + result20);

		boolean result21 = Pattern.matches(EMAIL, "abc()*@gmail.com");
		System.out.println("12. abc*@gmail.com.la" + ":" + result21);

		boolean result22 = Pattern.matches(EMAIL, "abc@gmail.com.au");
		System.out.println("13. abc@gmail.com.aa.au" + ":" + result22);

	}

	public static void main(String[] args) {
		userValidation();
	}
}
