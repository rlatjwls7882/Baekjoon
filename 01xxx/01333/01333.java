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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int L = Integer.valueOf(st.nextToken());
		int D = Integer.valueOf(st.nextToken());
		
		// 전화벨을 들을 수 있는 가장 빠른 시간 계산
		int time=0;
		
		while(N-->0) {
			time += L;
			
			// 앨범 종료
			if(N==0) {
				while(time%D!=0) {
					time++;
				}
				break;
			}
			
			// 노래 사이 조용한 시간 5초
			for(int i=0;i<5;i++) {
				if(time%D==0) {
					N=0;
					break;
				}
				time++;
			}
		}
		
		bw.write(Integer.toString(time));
		
		bw.close();
	} // end of main()
} // end of Main class