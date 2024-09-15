import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int V = Integer.valueOf(br.readLine());
		int h = (int)Math.cbrt(V);
		while(V%h!=0) {
			h--;
		}
		V/=h;
		
		int a = (int)Math.sqrt(V);
		while(V%a!=0) {
			a++;
		}
		int b = V/a;
		
		int cost = 2*(a*b+b*h+h*a);
		
		bw.write(cost+"");
		
		bw.close();
	} // end of main()
} // end of Main class