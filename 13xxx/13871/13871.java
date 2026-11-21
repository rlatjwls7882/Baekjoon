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
        
        // 충전소의 수 N, 명령의 수 C, 출력할 충전소의 번호 S
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int C = Integer.valueOf(st.nextToken());
        int S = Integer.valueOf(st.nextToken());
        
        // 충전소에 도착한 횟수 계산
        st = new StringTokenizer(br.readLine());
        int[] charging_station = new int[N]; charging_station[0]=1;
        int pos=0;
        
        while(C--!=0) {
        	
        	// 시계방향이나 반시계 방향으로 회전
        	if(st.nextToken().equals("1"))
        		pos++;
        	else
        		pos--;
        	
        	// 한바퀴 회전한 경우
        	if(pos==-1) pos=N-1;
        	else if(pos==N) pos=0;
        	
        	// 충전소 도착
        	charging_station[pos]++;
        }
        
        // S번 충전소에 도착한 횟수 출력
        bw.write(charging_station[S-1]+"");
        bw.close();
    } // end of main
} // end of Main class