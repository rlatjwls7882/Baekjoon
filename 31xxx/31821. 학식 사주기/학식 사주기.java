import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		int[] price = new int[N];
		for(int i=0;i<N;i++) {
			price[i] = Integer.valueOf(br.readLine());
		}
		
		int M = Integer.valueOf(br.readLine());
		int total=0;
		while(M-->0) {
			total += price[Integer.valueOf(br.readLine())-1];
		}
		bw.write(Integer.toString(total));

		bw.close();
	} // end of main
} // end of Main class