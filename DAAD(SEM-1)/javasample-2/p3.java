import java.util.Scanner;
class p3 {
	static void p3() {
		Scanner in = new Scanner(System.in);
		System.out.println("Give the number of rows Snould be between 2 and 8");
		int a = in .nextInt();

		while (a < 2 || a > 8) {
			System.out.println("Wrong input Try again. Should be between 2 and 8");
			a = in .nextInt();
		}

		int ar[][] = new int[a][a], b = 0;
		System.out.println("Give Input for node:");

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.println((i + 1) + "," + (j + 1));
				ar[i][j] = in .nextInt();

				if (i == 0 || j == 0 || i == (a - 1) || j == (a - 1))
					b += ar[i][j];
			}
		}

		System.out.println("Original Matrix:");

		for (int i = 0; i < a; i++) {
			System.out.print("|");

			for (int j = 0; j < a; j++) {
				System.out.print(ar[i][j] + "|");
			}

			System.out.println();
		}

		System.out.println("Sum of boundary elements: " + b);
		b = 0;
		int d = 8, e = 0;

		for (int i = a - 1; i >= 0; i--) {
			e = 0;

			for (int j = a - 1; j >= 0; j--) {
				if (ar[i][j]<ar[d][a]) 
				{
					ar[i][j] += ar[d][e];
					ar[d][e] = ar[i][j] - ar[d][e];
					ar[i][j] -= ar[d][e];
				}

				e++;
			}

			d++;
		}

		System.out.println("New Matrix:");

		for (int i = 0; i < a; i++) {
			System.out.println("|");

			for (int j = 0; j < a; j++) {
				System.out.print(ar[i][j] + "|");

				if (i == 0 || j == 0 || i == (a - 1) || j == (a - 1))
					b += ar[i][j];
			}

			System.out.println();
		}

		System.out.println("Sum of boundary elements: " + b);
	}

	public static void main(String args[]) 
	{
		p3();
	}
}