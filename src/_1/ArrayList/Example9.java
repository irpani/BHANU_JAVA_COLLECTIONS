package _1.ArrayList;

import java.util.ArrayList;

public class Example9 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");

		System.out.println(list.contains("Test1"));
	}

}
