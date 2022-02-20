package seleniumBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class S_12_27_4_IteratorMethod {

	public static void main(String[] args) throws InterruptedException {

		// Iterator

		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");

		@SuppressWarnings("unused")
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			it.next();
		}
		System.out.println(list);

		it.remove(); // remove is gonna remove the last value
		System.out.println(list);

		Set<String> list2 = new HashSet<String>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");

		Iterator<String> it2 = list2.iterator();
		while (it2.hasNext()) {
			it2.next();
		}
		System.out.println(list2);

		it2.remove();
		System.out.println(list2);

	}
}


