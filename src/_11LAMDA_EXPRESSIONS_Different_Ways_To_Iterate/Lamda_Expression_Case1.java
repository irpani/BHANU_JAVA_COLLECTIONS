package _11LAMDA_EXPRESSIONS_Different_Ways_To_Iterate;

public class Lamda_Expression_Case1 {

	// _______Interface having Only One Abstract Method_________

	public interface webpage {
		void header(String value);
	}

	// _______Anonymous Inner Class is implementing the above abstract
	// Method__________
	webpage w0 = new webpage() {

		@Override
		public void header(String value) {
			// TODO Auto-generated method stub

		}
	};

	// Implementing n no of Abstarct Methods through Anonymous Inner Class will
	// create
	// Biolerplate code -->For Avoiding this will go through the Lamda Expressions.

	// ____ Lamda Expression Case(1)___
	// n no Of Interface Methods will be Implemented with Lamda Expressions.

	public static void main(String[] args) {

		webpage w1 = (String value) -> {
			System.out.println("Hi.." + "Google");

		};
		webpage w2 = (String value) -> {
			System.out.println("Hello.." + "facebook");

		};

		/*
		 * . . . . .
		 */
		webpage wn = (String value) -> {
			System.out.println("Hello.." + "Yahoo");

		};

		w1.header("Google");
		w2.header("Gmail");
		/*
		 * . . . . .
		 */
		wn.header("corona");
		// n number 0f Abstract Methods will be Overrided and Implemented with Lamda
		// Expressions

	}

}
