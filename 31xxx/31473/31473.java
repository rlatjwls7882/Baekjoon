import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		int A=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			A += Integer.valueOf(st.nextToken());
		}
		
		int B=0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			B += Integer.valueOf(st.nextToken());
		}
        
		bw.write(B+" "+A);
		
		bw.close();
	} // end of main()
} // end of Main class