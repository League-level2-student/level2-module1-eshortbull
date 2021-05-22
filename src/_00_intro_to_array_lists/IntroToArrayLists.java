package _00_intro_to_array_lists;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroToArrayLists {
	public static void main(String[] args) {

		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList (java.util) class
		ArrayList<String> Strings = new ArrayList<String>();
		// 2. Add five Strings to your list
		Strings.add("1");
		Strings.add("2");
		Strings.add("3");
		Strings.add("4");
		Strings.add("5");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < 1; i++) {
			System.out.println(Strings);
		}

		// 4. Print all the Strings using a for-each loop
		for (String s : Strings) {
			System.out.println(s);
		}
		// 5. Print only the even numbered elements in the list.
		System.out.println(Strings.get(1));
		System.out.println(Strings.get(3));
		// 6. Print all the Strings in reverse order.
		for (int i = 4; i > -1; i--) {
			String l = Strings.get(i);
			System.out.println(l);
		}
		// 7. Print only the Strings that have the letter 'e' in them.

		for (int i = 0; i < Strings.size(); i++) {
			String s = Strings.get(i);
			if (s.contains("e")) {
				System.out.println(s);

			}
		}
	}

}
