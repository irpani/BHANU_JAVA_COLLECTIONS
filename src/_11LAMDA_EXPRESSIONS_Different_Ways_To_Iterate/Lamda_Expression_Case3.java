package _11LAMDA_EXPRESSIONS_Different_Ways_To_Iterate;

public class Lamda_Expression_Case3 {

	// Here what I am doing for Interface
	// webpage (String value) having only One Method with_Out Creating Object
	// Through Lamda Expression
	// I provide Implementation @override the Method .....

	public interface webpage {

		void header(String value);
	}

	public static void main(String[] args) {

		webpage w5 = (value) -> System.out.println(value.toUpperCase());
		webpage w6 = (value) -> System.out.println(value.charAt(2));
		// String value --->In plae Of Value I will give any name lets say n
		webpage w7 = (n) -> System.out.println(n.toLowerCase());

		w5.header("naveen");
		w6.header("IRFAN");
		w7.header("NAVEEN");
	}

}
