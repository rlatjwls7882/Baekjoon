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
		
		int N = Integer.valueOf(br.readLine());
		
		// 차기 회장으로 뽑힐 사람 확인
		String name="zzzz";
		int score=0;
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String A = st.nextToken();
			int B = Integer.valueOf(st.nextToken());
			
			if(B>score||B==score&&A.compareTo(name)<0) {
				name=A;
				score=B;
			}
		}
		
		bw.write(name);
		
		bw.close();
	} // end of main()
} // end of Main class