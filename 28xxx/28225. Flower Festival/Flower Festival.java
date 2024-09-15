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
        
        // 자동차의 수 n, 꽃길의 길이 f 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int f = Integer.valueOf(st.nextToken());

        // 축제에 가장 먼저 도착하는 자동차 번호 계산
        int first=0;
        double time=10000;
        
        for(int i=1;i<=n;i++) {
        	
        	// 해당 자동차의 관측 위치와 속도 입력
        	st = new StringTokenizer(br.readLine());
        	int x = Integer.valueOf(st.nextToken());
        	double v = Double.valueOf(st.nextToken());
        	
        	// 도착할때까지 걸리는 시간 계산
        	if((f-x)/v<time) {
        		time=(f-x)/v;
        		first=i;
        	}
        }
        
        // 축제에 가장 먼저 도착하는 자동차 번호 출력
        bw.write(first+"");
        
        bw.close();
    } // end of main
} // end of Main class