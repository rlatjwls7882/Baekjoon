import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] X = new int[N];
		for(int i=0;i<N;i++) {
			X[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(X);
		
		st = new StringTokenizer(br.readLine());
		int[] Y = new int[N];
		for(int i=0;i<N;i++) {
			Y[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(Y);
		
		boolean chk=true;
		for(int i=0;i<N;i++) {
			if(X[i]>Y[i]) {
				chk=false;
				break;
			}
		}
		
		if(chk) {
			bw.write("DA");
		} else {
			bw.write("NE");
		}
		
		bw.close();
	} // end of main()
} // end of Main class