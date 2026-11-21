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
        
        // 택시를 기다리고 있는 위치
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.valueOf(st.nextToken());
        int y = Integer.valueOf(st.nextToken());
        
        // 택시의 수 입력
        int N = Integer.valueOf(br.readLine());
        
        // 가장 가까운 택시의 위치 계산
        int taxy_x=1000, taxy_y=1000;
        
        while(N--!=0) {
        	
        	// 각 택시의 x , y 좌표 입력
        	st = new StringTokenizer(br.readLine());
        	int tmpx = Integer.valueOf(st.nextToken());
        	int tmpy = Integer.valueOf(st.nextToken());
        	
        	// 전 택시보다 가까운지 확인
        	if(Math.abs(taxy_x-x)+Math.abs(taxy_y-y)>
        	Math.abs(tmpx-x)+Math.abs(tmpy-y)) {
        		taxy_x = tmpx;
        		taxy_y = tmpy;
        	}
        }
        
        // 가장 가까운 택시의 위치 출력
        bw.write(taxy_x+" "+taxy_y);
        bw.close();
    } // end of main
} // end of Main class