package _11LAMDA_EXPRESSIONS_Different_Ways_To_Iterate;

public class Lamda_Expression_Case4 {

	// Here what I am doing for Interface
	// webpage (String value) having only One Method with_Out Creating Object
	// Through Lamda Expression
	// I provide Implementation @override the Method .....

	// ___Created New Interface with Multiple parameters

	@FunctionalInterface
	public interface homepage {

		void footer(String value, int age);

	}

	public static void main(String[] args) {

		homepage w8 = (value, age) -> System.out.print("hi.." + value + "  " + "age.." + age);

		w8.footer("google", 20);

	}

}
