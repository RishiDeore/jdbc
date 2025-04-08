package collectionsbasics;

import java.util.*;

public class Day12Que3 {
	public static void main(String args[]) {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. Add a string to the list\r\n" + "2. Insert a string at a specific index\r\n"
					+ "3. Check if a string exists (case-insensiƟve)\r\n" + "4. Remove a string by index\r\n"
					+ "5. Display all strings in UPPERCASE\r\n" + "6. Display all strings in lowercase\r\n"
					+ "7. Count how many strings have length greater than a given number\r\n"
					+ "8. Display strings that contain only digits\r\n"
					+ "9. Reverse each string in the list and print\r\n" + "10. Clear the entire list\r\n"
					+ "11. Exit");
			System.out.println("Enter the Choice : ");
			int ch = sc.nextInt();
			String str;
			int ind = 0;
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter the String : ");
				str = sc.nextLine();
				arr.add(str);
				break;
			case 2:
				System.out.println("Enter the String : ");
				str = sc.nextLine();
				System.out.println("Enter the Index : ");
				ind = sc.nextInt();
				arr.add(ind, str);
				break;
			case 3:
				System.out.println("Enter the String : ");
				str = sc.nextLine();
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).equals(str)) {
						System.out.println("String Found!");
						return;
					}
				}
				System.out.println("String Not Found");
				break;
			case 4:
				System.out.println("Enter the Index : ");
				ind = sc.nextInt();
				if (ind < arr.size()) {
					arr.remove(ind);
					System.out.println("String Removed");
				} else {
					System.out.println("String Not Found");
				}
				break;
			case 5:
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i).toUpperCase());
				}
				break;
			case 6:
				for (int i = 0; i < arr.size(); i++) {
					System.out.println(arr.get(i).toLowerCase());
				}
				break;
			case 7:
				int cnt = 0;
				System.out.println("Enter the Length : ");
				ind = sc.nextInt();
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).length() > ind)
						cnt++;
				}
				System.out.println(cnt);
				break;
			case 8:
				
				break;
			case 9:

				for (int i = 0; i < arr.size(); i++) {
					StringBuilder str2 = new StringBuilder();
					str2.append(arr.get(i));
					System.out.println(str2.reverse());
				}
				break;
			case 10:
				arr.clear();
				break;
			case 11:
				sc.close();
				System.out.println("EXIT");
				System.exit(0);
				break;
			}

		}
	}
}