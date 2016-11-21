import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;

public class LongestSubseq {

	public String longseq(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();

		int[][] arr = new int[len1 + 1][len2 + 1];
		int len = 0, pos = -1;

		for (int x = 1; x < len1 + 1; x++) {
			for (int y = 1; y < len2 + 1; y++) {
				if (str1.charAt(x - 1) == str2.charAt(y - 1)) {
					arr[x][y] = arr[x - 1][y - 1] + 1;
					if (arr[x][y] > len) {
						len = arr[x][y];
						pos = x;
					}
				} else
					arr[x][y] = 0;
			}
		}

		return str1.substring(pos - len, pos);
	}

	public static void main(String[] args) {
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			System.out.println("Enter first string: ");
			String str1 = br.readLine();

			System.out.println("Enter Second String:");
			String str2 = br.readLine();

			LongestSubseq o = new LongestSubseq();
			String res = o.longseq(str1, str2);

			System.out.println("Longest common sequence: " + res);

		} catch (IOException e) {
			System.out.println(" ");
		}

	}
}
