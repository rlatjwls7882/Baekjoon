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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int I = Integer.valueOf(st.nextToken());
		
		// 사전순으로 I번째 문자열 출력
		String[] strings = new String[N];
		for(int i=0;i<N;i++) {
			strings[i] = br.readLine();
		}
		Arrays.sort(strings);
		
		bw.write(strings[I-1]);
		
		bw.close();
	} // end of main()
} // end of Main class