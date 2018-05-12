package babylonian;

import java.util.Scanner;
import java.text.DecimalFormat;

public class babylonian {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		double n = keyboard.nextDouble();

		double guess1 = n / 2, guess2 = 0, r = 0, diff;

		do {

			r = n / guess1;
			guess2 = (guess1 + r) / 2;

			diff = (guess1 - guess2) / 100;

			guess1 = guess2;

		} while (diff > 0.01 || diff < -0.01);
		
		DecimalFormat form =new DecimalFormat("0.00");

		System.out.print(form.format(guess2));

	}

}
