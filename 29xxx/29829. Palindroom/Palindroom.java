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
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		int D = Integer.valueOf(st.nextToken());
		
		if(A==D) {
			bw.write("JAH\n");
			bw.write(A+" "+C+" "+C+" "+A);
		} else if(B==C) {
			bw.write("JAH\n");
			bw.write(A+" "+B+" "+B+" "+A);
		} else {
			bw.write("EI");
		}
		
		bw.close();
	} // end of main()
} // end of Main class