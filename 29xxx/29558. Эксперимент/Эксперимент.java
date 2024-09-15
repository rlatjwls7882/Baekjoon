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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int D = Integer.valueOf(st.nextToken());
		
		if(N%2==1) {
			bw.write(D+" ");
		}
		for(int i=1;i<=N;i+=2) {
			bw.write((D-i)+" "+(D+i)+" ");
		}
		
		bw.close();
	} // end of main()
} // end of Main class