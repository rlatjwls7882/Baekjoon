import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int K = Integer.valueOf(br.readLine());
			
			// 현재 실을 수 있는 최대 차원의 무게
			int weight=1;
			while(weight*3<=K) {
				weight*=3;
			}
			
			// 가치를 극대화 하기 위해 실어야 하는 물품 계산
			while(weight!=0) {
				int cnt=0;
				
				while(weight<=K) {
					K-=weight;
					cnt++;
				}
				weight/=3;
				
				bw.write(Integer.toString(cnt));
				bw.write(' ');
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class