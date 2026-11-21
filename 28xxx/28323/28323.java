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
		
		// 수열의 길이 N
		int N = Integer.valueOf(br.readLine());
		
		// 불안정한 수열의 최대 길이 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length=0, beforeVal=2;
		
		while(N-->0) {
			int nextVal = Integer.valueOf(st.nextToken())%2;
			
			if(nextVal!=beforeVal) {
				length++;
				beforeVal=nextVal;
			}
		}
		
		bw.write(Integer.toString(length));
		
		bw.close();
	} // end of main()
} // end of Main class