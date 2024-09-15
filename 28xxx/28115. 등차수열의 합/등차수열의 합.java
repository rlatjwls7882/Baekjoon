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
		
		// 길이 N의 배열 A 입력
		int N = Integer.valueOf(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i] = Integer.valueOf(st.nextToken());
		}
		
		// A가 등차수열인지 확인
		boolean chk=true;
		for(int i=1;i<N-1;i++) {
			if(A[i]-A[i-1]!=A[i+1]-A[i]) {
				chk=false;
				break;
			}
		}
		
		// 등차수열이 아닌 경우
		if(!chk) {
			bw.write("NO");
		}
		
		// 등차수열인 경우
		else {
			bw.write("YES\n");
			
			for(int i=0;i<N;i++) {
				bw.write(Integer.toString(A[i]));
				bw.write(' ');
			}
			bw.newLine();
			
			for(int i=0;i<N;i++) {
				bw.write("0 ");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class