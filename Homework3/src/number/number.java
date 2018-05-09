package number;

import java.util.Scanner;

public class number {
	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		String n = keyboard.nextLine();
		
		long n2 = Integer.valueOf(n.substring(2));
		
		if (n.substring(0, 1).equals("X"))
			System.out.print(judge(n2));

		else {
			long i = 0;
			int count = 0;
			do {
				i++;
				if (judge(i) == true)
					count++;
			} while (count < n2);

			System.out.print(i);
		}

	}

	public static boolean judge(long a) {

		for (int i = 2; i <= a; i++) {
			while (a % i == 0) {

				if (a == 1)
					return true;

				if (i != 2 && i != 3 && i != 5)
					return false;

				else
					a /= i;

			}
		}
		return true;

	}

}
