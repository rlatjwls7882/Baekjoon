import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = Integer.parseInt(bf.readLine());
		int d = Integer.parseInt(bf.readLine());
		
		if((a==8||a==9)&&(d==8||d==9)&&b==c)
			System.out.println("ignore");
		else
			System.out.println("answer");
	}
}