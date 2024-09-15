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
        
        // 우유와 꿀의 단위 행복도
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.valueOf(st.nextToken());
        int H = Integer.valueOf(st.nextToken());
        
        // 밭의 수
        int N = Integer.valueOf(br.readLine());
        	
        // 최대 행복도 계산
        int maxHappiness=0;
        
        while(N-->0) {
        	
        	// 소와 벌의 수용 가능도
        	st = new StringTokenizer(br.readLine());
        	int C = Integer.valueOf(st.nextToken());
        	int B = Integer.valueOf(st.nextToken());
        	
        	// 더 높은 행복도 확인
        	maxHappiness += C*M>H*B ? C*M:H*B;
        }
        
        // 최대 행복도 출력
        bw.write(maxHappiness+"");
        
        bw.close();
    } // end of main
} // end of Main class