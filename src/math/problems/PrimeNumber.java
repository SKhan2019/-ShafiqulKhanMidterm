package math.problems;

import java.util.Scanner;
public class PrimeNumber {


	public static void main(String[] args) {
		int x = 1000000;
		System.out.println("Prime numbers from 2 to 1 million : ");
		PrimeNumber n = new PrimeNumber();
		n.primeNumbers(x);
	}

	public void primeNumbers(int x) {
		boolean prime[] = new boolean[x + 1];
		for (int i = 0; i < x; i++)
			prime[i] = true;

		for (int c = 2; c * c <= x; c++) {
			if (prime[c] == true) {
				for (int i = c * 2; i <= x; i += c)
					prime[i] = false;
			}
		}

		for (int i = 2; i <= x; i++) {
			if (prime[i] == true)
				System.out.println(i + " ");
			Scanner sc = new Scanner(System.in);

			System.out.println("How Many Rows You Want In Your Pyramid?");

			int noOfRows = sc.nextInt();

			int rowCount = 1;
		}
	}
}
/*
Write 40 Fibonacci numbers with java.
0,1,1,2,3,5,8,13
*//*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */



