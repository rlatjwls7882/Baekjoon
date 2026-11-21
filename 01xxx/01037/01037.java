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

		// N의 진짜 약수의 개수 입력
		int N = Integer.valueOf(br.readLine());
		
		// 진짜 약수의 최솟값, 최댓값 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max=2, min=1000000;
		
		while(N-->0) {
			int tmp = Integer.valueOf(st.nextToken());
			
			if(tmp>max) max=tmp;
			if(tmp<min) min=tmp;
		}
		
		// N 출력
		bw.write(min*max+"");
		
		bw.close();
	} // end of main
} // end of Main class