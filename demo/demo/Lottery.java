package demo;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your lottery pick (two digits): ");
		String pick = in.nextLine();

		String lotteryNo = Long.toString(Math.round(((Math.random()) * 99) + 10));

		System.out.println("The lottery number is: " + lotteryNo);

		if (pick.length() == 1) {
			pick = "0" + pick.charAt(0);
			//System.out.println(pick);
			if (lotteryNo.charAt(0) == (pick.charAt(0))
					&& lotteryNo.charAt(1) == (pick.charAt(1))) {
				System.out.println("Exact Match: you win $10,000");

			} else if (lotteryNo.charAt(0) == (pick.charAt(1))
					&& lotteryNo.charAt(1) == (pick.charAt(0))) {
				System.out.println("Match all digits: you win $3,000");

			} else if ((lotteryNo.charAt(0) == (pick.charAt(0)) || lotteryNo
					.charAt(1) == (pick.charAt(1)))
					|| (lotteryNo.charAt(0) == (pick.charAt(1)) || lotteryNo
							.charAt(1) == (pick.charAt(0)))) {

				System.out.println("Match one digit: you win $1,000");

			} else {

				System.out.println("Sorry: No Match...");
			}

		} else if(pick.length() == 2) {
			if (lotteryNo.charAt(0) == (pick.charAt(0))
					&& lotteryNo.charAt(1) == (pick.charAt(1))) {
				System.out.println("Exact Match: you win $10,000");

			} else if (lotteryNo.charAt(0) == (pick.charAt(1))
					&& lotteryNo.charAt(1) == (pick.charAt(0))) {
				System.out.println("Match all digits: you win $3,000");

			} else if ((lotteryNo.charAt(0) == (pick.charAt(0)) || lotteryNo
					.charAt(1) == (pick.charAt(1)))
					|| (lotteryNo.charAt(0) == (pick.charAt(1)) || lotteryNo
							.charAt(1) == (pick.charAt(0)))) {

				System.out.println("Match one digit: you win $1,000");

			} else {

				System.out.println("Sorry: No Match...");
			}

		}else{
			System.out.println("Invalid Input. Please try again!");
		}

	}

}
