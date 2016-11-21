import java.io.BufferedReader;
import java.io.InputStreamReader;

public class thread1 {
	public static void main(String[] args) {
		try {
			String process;

			Process p = Runtime.getRuntime().exec("tasklist.exe");
			BufferedReader input = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			while ((process = input.readLine()) != null) {
				System.out.println(process);
				Thread.sleep(1000);
			}
			input.close();
		} catch (Exception err) {
			err.printStackTrace();
		}
	}
}