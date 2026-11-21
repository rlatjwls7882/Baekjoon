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
        
        // 강의실의 수 N, 예약 횟수 M 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        // 현재 예약 시간
        int[] reserve = new int[N];
        
        while(M--!=0) {
        	
        	// 예약하는 강의실 번호, 이용 시작시간과 끝나는 시간 입력
        	st = new StringTokenizer(br.readLine());
        	int cur_reserve = Integer.valueOf(st.nextToken());
        	int start = Integer.valueOf(st.nextToken());
        	int end = Integer.valueOf(st.nextToken());
        	
        	// 예약 성공
        	if(reserve[cur_reserve-1]<=start) {
        		reserve[cur_reserve-1] = end;
        		bw.write("YES\n");
        	}
        	
        	// 예약 실패
        	else
        		bw.write("NO\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class