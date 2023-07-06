package _11LAMDA_EXPRESSIONS_Different_Ways_To_Iterate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*6 ways to iterate

1.Using Iterator
2.Using a ListIterator to traverse in both the Directions
3.Using for each Loop 
4.Using for Loop with Order/Index 

________Lamda Expressions very Easy__________
5.Using Iterator and java 8 foreachRemaining()method  var.forEachRemaining(shows -> {};)
6.Using java8 with for each Loop and Lamda Expression var.foreach(shows-> {};)
*
*/

public class Iterate_6_Different_ways {
	public static void main(String[] args) {

		// ______6.Using java8 with for each Loop and Lamda Expression_______
		System.out.println("__________for each Loop and Lamda Expression____________");
		ArrayList<String> tvSerice = new ArrayList<>();
		tvSerice.add("Game Of Throwns");
		tvSerice.add("Beaking BAD");
		tvSerice.add("The Big Bang Theory");
		tvSerice.add("The Walking Dead");
		tvSerice.add("Prison Break");

		tvSerice.forEach(shows -> {
			System.out.println(shows);
		});

		System.out.println("_____________________");

		// ________1.Using Iterator__________
		System.out.println("__________Using Iterator _____________");

		Iterator<String> it = tvSerice.iterator();

		while (it.hasNext()) {
			String shows = (String) it.next();
			System.out.println(shows);
		}

		System.out.println("_______________________");

		// __5.Using Iterator and java 8 foreachRemaining()method___
		System.out.println("______Iterator and java 8 foreachRemaining()method______");
		it = tvSerice.iterator();
		it.forEachRemaining(shows -> {
			System.out.println(shows);

		});

		System.out.println("_______________________");

		// 3.Using for each Loop
		System.out.println("_____Using for each Loop ______");
		for (String show : tvSerice) {
			System.out.println(show);
		}

		System.out.println("_______________________");

		// 4.Using for Loop
		System.out.println("_____Using for  Loop ______");
		for (int i = 0; i < tvSerice.size(); i++) {
			System.out.println(tvSerice.get(i));
		}

		System.out.println("_______________________");

		// ________1.Using List Iterator__________
		System.out.println("__________Using List  Iterator _____________");

		ListIterator<String> tvSericelistIterator = tvSerice.listIterator(tvSerice.size());

		while (tvSericelistIterator.hasPrevious()) {
			String show = tvSericelistIterator.previous();
			System.out.println(show);
		}

	}

}
