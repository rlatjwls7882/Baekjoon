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
        
        // 발사 허가가 유효한 날의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // 우주쓰레기가 가장 적은 날 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int mintrash = 1000000000, day=0;
        
        for(int i=0;i<n;i++) {
        	
        	// i번째 날의 쓰레기의 양 입력
        	int itrash = Integer.valueOf(st.nextToken());
        	
        	// 쓰레기의 양이 mintrash보다 적게 기록된 날 기록
        	if(mintrash>itrash) {
        		mintrash = itrash;
        		day = i;
        	}
        }
        
        // 우주쓰레기가 가장 적은 날 출력
        bw.write(day+"");
        bw.close();
    } // end of main
} // end of Main class