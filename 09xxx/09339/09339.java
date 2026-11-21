import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// K명의 수강생의 번호 입력
			int K = Integer.valueOf(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			HashSet<Integer> studentList = new HashSet<>();
			for(int i=0;i<K;i++) {
				studentList.add(Integer.valueOf(st.nextToken()));
			}
			
			// 가장 먼저 들어온 사람 확인
			int N = Integer.valueOf(br.readLine());
			int goalNum=0, winnerNum=0, time=1000000;
			
			while(N-->0) {
				st = new StringTokenizer(br.readLine());
				int num = Integer.valueOf(st.nextToken());
				
				if(studentList.contains(num)) {
					int curTime = Integer.valueOf(st.nextToken())*60+Integer.valueOf(st.nextToken());
					
					if(curTime==-61) {
						continue;
					}
					
					if(curTime<=360) {
						goalNum++;
					}
					
					if(curTime<time) {
						winnerNum = num;
						time = curTime;
					}
				}
			}
			
			// 출력
			bw.write(winnerNum+" "+goalNum+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class