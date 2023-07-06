package _11LAMDA_EXPRESSIONS_Different_Ways_To_Iterate;

//Here what I am doing for Interface 
//webpage (String value) having only One Method with_Out Creating Object Through Lamda Expression
//I provide Implementation @override the Method .....

/*public interface webpage {

	void header(String value);
}*/

public class Lamda_Expression_Case2 {

	public static void main(String[] args) {

		// ____Lamda ExpressionCase: (2)_____
		webpage w5 = (String value) -> {
			System.out.println("Hi.." + "Google");
		};

		webpage w6 = (String value) -> {
			System.out.println("Hello.." + "facebook");
		};

		w5.header("Google");
		w6.header("Gmail");
	}
}