package _10Hashing;

import java.util.ArrayList;
import java.util.Collections;

public class PersonHashingTest3 implements Comparable<PersonHashingTest3> {
	int rollno;
	String name;
	int age;

	PersonHashingTest3(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(PersonHashingTest3 st) {
		if (age == st.age)
			return 0;
		else if (age < st.age)
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		ArrayList<PersonHashingTest3> al = new ArrayList<PersonHashingTest3>();
		al.add(new PersonHashingTest3(101, "Mohan", 23));
		al.add(new PersonHashingTest3(102, "Amit", 20));
		al.add(new PersonHashingTest3(109, "Sohan", 22));

		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

		// for (Student st : al) {
		// System.out.println(st.rollno + " " + st.name + " " + st.age);
		// }
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

}