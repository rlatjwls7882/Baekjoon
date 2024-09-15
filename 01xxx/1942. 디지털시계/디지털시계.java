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
		
		for(int cases=0;cases<3;cases++) {
			
			// 시작시간과 종료시간 입력
			StringTokenizer st = new StringTokenizer(br.readLine()," :");
			int t1 = Integer.valueOf(st.nextToken())*10000;
			t1 += Integer.valueOf(st.nextToken())*100;
			t1 += Integer.valueOf(st.nextToken());
			
			int t2 = Integer.valueOf(st.nextToken())*10000;
			t2 += Integer.valueOf(st.nextToken())*100;
			t2 += Integer.valueOf(st.nextToken());
			
			if(t1>t2) {
				t2 += 240000;
			}
			
			// 3의 배수인 시계 정수의 개수 계산
			int cnt=0;
			
			for(;t1<=t2;t1++) {
				if(t1%100==60) {
					t1+=40;
				}
				if(t1%10000==6000) {
					t1+=4000;
				}
				
				if(t1>=240000&&(t1-240000)%3==0) {
					cnt++;
				} else if(t1<240000&&t1%3==0) {
					cnt++;
				}
			}	
			
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class