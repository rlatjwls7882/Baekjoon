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

        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 10개의 스포트라이트의 색의 단순 합 계산
        	int r=0, g=0, b=0;
        	
        	for(int i=0;i<10;i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		r += Integer.valueOf(st.nextToken());
        		g += Integer.valueOf(st.nextToken());
        		b += Integer.valueOf(st.nextToken());
        	}
        	
        	// 10개의 스포트라이트의 색의 평균 출력
        	bw.write(String.format("%.0f %.0f %.0f\n", r/10., g/10., b/10.));
        }
        
        bw.close();
    } // end of main
} // end of Main class