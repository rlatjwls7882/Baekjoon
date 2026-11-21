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
		int[] U1 = new int[5];
		for(int i=0;i<5;i++) {
			U1[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(U1);
		
		st = new StringTokenizer(br.readLine());
		int[] U2 = new int[5];
		for(int i=0;i<5;i++) {
			U2[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(U2);
		
		int cnt=0;
		for(int i=0;i<5;i++) {
			if(U1[i]>U2[i]) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class