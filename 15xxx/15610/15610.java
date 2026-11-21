import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		double N = Double.valueOf(bf.readLine());
		
		System.out.println(Math.sqrt(N)*4);
	}
}