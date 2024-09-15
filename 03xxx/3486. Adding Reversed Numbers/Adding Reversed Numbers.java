import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			
			// 뒤집은 A와 뒤집은 B의 합의 뒤집은 값 계산
			bw.write(reverse(reverse(A)+reverse(B))+"\n");
		}
		
		bw.close();
	} // end of main()
	
	// 수 뒤집기
	static int reverse(int num) {
		
		String string = Integer.toString(num);
		StringBuilder sb = new StringBuilder();
		
		for(int i=string.length()-1;i>=0;i--)
			sb.append(string.charAt(i));
		
		return Integer.valueOf(sb.toString());
	}
	
} // end of Main class