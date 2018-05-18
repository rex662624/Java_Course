package hw5;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);

		String mode = keyboard.nextLine();
		String type = keyboard.nextLine();

		if (type.equals("Document")) {

			Document obj1 = new Document();

			obj1.setText(keyboard.nextLine());

			if (mode.equals("A")) {

				System.out.print(obj1.toString());
			}

			else if (mode.equals("B")) {
				String keyword = keyboard.nextLine();

				int judge = obj1.text.indexOf(keyword);
				if (judge == -1) {
					System.out.print("false");
				} else {
					System.out.print("true");
				}

			} else if (mode.equals("C")) {

				String update = keyboard.nextLine();
				if (update.equals("text")) {
					obj1.setText(keyboard.nextLine());
					System.out.print(obj1.toString());
				}

			}

		}

		else if (type.equals("Email")) {

			Email obj2 = new Email();
			obj2.setSender(keyboard.nextLine());
			obj2.setRecipient(keyboard.nextLine());
			obj2.setTitle(keyboard.nextLine());
			obj2.setText(keyboard.nextLine());

			if (mode.equals("A")) {

				System.out.print(obj2.toString());
			}

			else if (mode.equals("B")) {
				String keyword = keyboard.nextLine();

				int judge = obj2.text.indexOf(keyword);
				if (judge == -1) {
					System.out.print("false");
				} else {
					System.out.print("true");
				}

			} else if (mode.equals("C")) {

				String update = keyboard.nextLine();

				if (update.equals("text"))
					obj2.setText(keyboard.nextLine());
				else if (update.equals("sender"))
					obj2.setSender(keyboard.nextLine());
				else if (update.equals("recipient"))
					obj2.setRecipient(keyboard.nextLine());
				else if (update.equals("title"))
					obj2.setTitle(keyboard.nextLine());

				System.out.print(obj2.toString());
			}

		}

		else if (type.equals("File")) {

			File obj3 = new File();
			obj3.setPathname(keyboard.nextLine());
			obj3.setText(keyboard.nextLine());

			if (mode.equals("A")) {

				System.out.print(obj3.toString());
			}

			else if (mode.equals("B")) {
				String keyword = keyboard.nextLine();

				int judge = obj3.text.indexOf(keyword);
				if (judge == -1) {
					System.out.print("false");
				} else {
					System.out.print("true");
				}

			} else if (mode.equals("C")) {

				String update = keyboard.nextLine();

				if (update.equals("text"))
					obj3.setText(keyboard.nextLine());
				else if (update.equals("pathname"))
					obj3.setPathname(keyboard.nextLine());

				System.out.print(obj3.toString());
			}

		}

	}

}
