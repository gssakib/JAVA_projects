package demo;

import java.util.Scanner;

public class SocialSecurity {

	public static void main(String[] args) {
		System.out.print("Enter a SSN (in the format, DDD-DD-DDDD): ");
		Scanner input = new Scanner(System.in);

		String social = input.nextLine(); // inputting as string

		double count = 0; // initializing count

		// indexing through the whole string
		if (social.length() == 11) {

			for (int i = 0; i < 11; i++) {
				// System.out.println(i);
				char aChar = social.charAt(i); // indexing through each
												// character
				// System.out.println(aChar);
				if (i != 3 && i != 6) { // if its not indexing where the hyphen
										// is supposed to be
					if (aChar != "-".charAt(0)) {// if the character is not a
													// hyphen
						// System.out.println(aChar);
						int aInt = Character.getNumericValue(aChar);
						// System.out.println(aInt);
						if (aInt > 9) {// if it is not 0-9
							count = count + 0;
						} else {
							count = count + 1;
						}

					} else {// if character is a hyphen
						count = count + 0;

					}

				} else {// if the character is a hyphen and it is indexed where
						// its supposed to be
						// System.out.println(aChar);
					if (aChar == "-".charAt(0)) {
						// System.out.println(aChar);
						count = count + 1;
					}

				}

			}

			// System.out.println(count);
			if (count == 11) {
				System.out.println(social
						+ " is a valid Social Security Number.");
			} else {
				System.out.println(social
						+ " is an invalid Social Security Number.");
			}

		} else {
			System.out.println(social
					+ " is an invalid Social Security Number.");
		}

	}

}
