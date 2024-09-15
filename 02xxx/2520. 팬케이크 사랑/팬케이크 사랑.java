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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 밀가루 반죽으로 만들 수 있는 최대 팬케이크의 수 계산
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int f = Integer.valueOf(st.nextToken())*2;
			f = Math.min(f, Integer.valueOf(st.nextToken())*2);
			f = Math.min(f, Integer.valueOf(st.nextToken())*4);
			f = Math.min(f, Integer.valueOf(st.nextToken())*16);
			f = Math.min(f, Integer.valueOf(st.nextToken())*16/9);
			
			// 토핑으로 만들 수 있는 최대 팬케이크의 수 계산
			st = new StringTokenizer(br.readLine());
			int t = Integer.valueOf(st.nextToken());
			t += Integer.valueOf(st.nextToken())/30;
			t += Integer.valueOf(st.nextToken())/25;
			t += Integer.valueOf(st.nextToken())/10;
			
			// 만들 수 있는 최대 팬케이크의 수 출력
			bw.write(Integer.toString(Math.min(f, t)));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class