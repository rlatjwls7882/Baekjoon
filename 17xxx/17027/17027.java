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
		
		// 섞는 횟수 N
		int N = Integer.valueOf(br.readLine());
		
		// 초기 조개껍데기의 상태
		int[] shell = {0, 1, 2};
		
		// 엘시가 고르는 조개껍데기 속 내용물의 횟수 계산
		int[] tell = new int[3];
		
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken())-1;
			int b = Integer.valueOf(st.nextToken())-1;
			int g = Integer.valueOf(st.nextToken())-1;
			
			// swap
			int tmp = shell[a];
			shell[a] = shell[b];
			shell[b] = tmp;
			
			tell[shell[g]]++;
		}
		
		// 엘시가 얻을 수 있는 최대 점수 계산
		bw.write(Integer.toString(Math.max(Math.max(tell[0], tell[1]), tell[2])));
		
		bw.close();
	} // end of main()
} // end of Main class