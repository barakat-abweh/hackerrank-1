import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numerator = sc.nextInt();
		int denominator = sc.nextInt();
		int n = sc.nextInt();

		System.out.printf("%.3f\n", solve(numerator, denominator, n));

		sc.close();
	}

	static double solve(int numerator, int denominator, int n) {
		double p = (double) numerator / denominator;
		return p * Math.pow(1 - p, n - 1);
	}
}
