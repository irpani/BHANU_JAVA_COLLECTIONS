package _11LAMDA_EXPRESSIONS_Different_Ways_To_Iterate;

public class Lamda_Expression_Replication {

	public static void main(String[] args) {
		// Anonymous Inner class Already Available in Java
		// No need to Create Seperate Class
		// Right hand Side behave like Class ......

		// Q:Requirement
		// ____ Ihave One interface i.e @Functional Interface
		// I want to Implement it with_Out Creating Class ___
		/*
		 * @Functional Interface public interface webpage {
		 * 
		 * void header(String value); }
		 */

		// Solution:(1) Go with Anonymous inner class

		// _______Anonymous Inner Class__________
		webpage w0 = new webpage() {

			@Override
			public void header(String value) {
				// TODO Auto-generated method stub

			}
		};

		// Solution:(2) For Avoiding Bioler plate Code Go through the Lamda Expression

		// _____Lamda Expression______

		/**
		 * (String value) -> { System.out.println("Hi.." + "Google");
		 * 
		 * };
		 * 
		 * Lamda --is Nothing but Body of a Method this Value-reprasent the Body Value
		 * is @Overridden Value from Particular Interface JAVA Automatically Understood.
		 * (String value)->{ System.out.println("Hi.." + "Google"); };
		 */

		// ____ Lamda Expression Case(1)___
		webpage w1 = (String value) -> {
			System.out.println("Hi.." + "Google");

		};
		webpage w2 = (String value) -> {
			System.out.println("Hello.." + "facebook");

		};

		webpage w3 = (String value) -> {
			System.out.println("Hi.." + "Google");
		};

		webpage w4 = (String value) -> {
			System.out.println("Hello.." + "facebook");
		};

		/*
		 * w1.header("Google"); w2.header("facebook"); w3.header("whatapp");
		 * w4.header("Instagram");
		 */

		// ____Lamda ExpressionCase: (2)_____
		webpage w5 = (String value) -> System.out.println("Hi.." + "Google");

		webpage w6 = (String value) -> System.out.println("Hello.." + "facebook");

		w5.header("gmail");
		w6.header("Orkut");

	}
}
