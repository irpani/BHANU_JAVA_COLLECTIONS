package _11LAMDA_EXPRESSIONS_Different_Ways_To_Iterate;

class ForEachCompleteReplication {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 6, 7, 8 };
		int c[] = { 9, 10, 11, 12 };

		// _________ For_Each --Single Dimesiona Array___________
		// int a[]={1,2,3,4};
		System.out.println("For_Each  Single Dimensional Array Output");

		for (int q : a) {
			System.out.print(" " + q);
		}
		System.out.println();

		System.out.println("______________");

		int[][] d = {

				{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		// case: (1)

		System.out.println("" + d[1][2]);
		// case: (2)
		System.out.println("For_Each Case (1)Two Dimensional Array Output");
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}
		System.out.println("______________");

		System.out.println("For_Each Case (2) Two Dimensional Array Output");
		// case: (3)
		for (int i = 0; i < d.length; i++) {

			for (int j = 0; j < d[i].length; j++) {

				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}

		System.out.println("______________");

		// ______ //for each: Two Dimesional Array :________
		System.out.println("For_Each Case (3) Two Dimensional Array Output");
		for (int z[] : d) {
			for (int h : z) {
				System.out.print(" " + h);

			}
			System.out.println();
		}

		System.out.println("______________");
		System.out.println("For_Each  Three Dimensional Array Output");

		// ____________for each: Three Dimesional Array __________
		int[][][] d1 = { {

				// Combination Of two Dimesional Arrays are Called As Three Dimesional Array.
				{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },

				{ 10, 20, 30, 40 }, { 50, 60, 70, 80 }, { 90, 100, 110, 120 }

				} };

		for (int k[][] : d1) {

			for (int l[] : k) {

				for (int i : l) {
					System.out.print(" " + i);
				}
				System.out.println();
			}
		}

	}
}