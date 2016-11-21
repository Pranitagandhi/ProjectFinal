import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class linecount {

	public int countLineNumber() {
		int charCount = 0;

		int wordCount = 0;

		int lineCount = 0;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					"C:\\pranita\\prani.txt"));

			String currentLine = reader.readLine();

			while (currentLine != null) {

				lineCount++;

				String[] words = currentLine.split(" ");

				wordCount = wordCount + words.length;

				for (String word : words) {

					charCount = charCount + word.length();
				}

				currentLine = reader.readLine();
			}
			System.out.println("Number Of Chars In A File : " + charCount);

			System.out.println("Number Of Words In A File : " + wordCount);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lineCount;

	}

	public static void main(String[] args) {

		int totalLines = new linecount().countLineNumber();

		System.out.println("Number Of Lines In A File : " + totalLines);
	}
}
