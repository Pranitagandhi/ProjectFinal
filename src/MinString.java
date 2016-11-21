import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinString {
	static int min(int x, int y, int z) {
		if (x < y && x < z)
			return x;
		if (y < x && y < z)
			return y;
		else
			return z;
	}

	static int editDist(String str1, String str2, int m, int n) {

		if (m == 0) {

			return n;
		}

		if (n == 0)
			return m;

		if (str1.charAt(m - 1) == str2.charAt(n - 1))
			return editDist(str1, str2, m - 1, n - 1);

		return 1 + min(editDist(str1, str2, m, n - 1), // Insert
				editDist(str1, str2, m - 1, n), // Remove
				editDist(str1, str2, m - 1, n - 1) // Replace
		);
	}

	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter first string: ");
			String str1 = br.readLine();

			System.out.println("Enter Second String:");
			String str2 = br.readLine();

			System.out.println(editDist(str1, str2, str1.length(),
					str2.length()));

		} catch (IOException e) {
			System.out.println(" ");
		}
	}
}
