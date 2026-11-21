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
        
        // 트랙 섹션 수 N, 썰매가 멈추는 속도 S 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int S = Integer.valueOf(st.nextToken());
        
        // 트랙 끝에서의 썰매의 속도 계산
        int speed=0;
        
        for(int i=1;i<=N;i++) {
        	speed += Integer.valueOf(br.readLine());
        	
        	if(speed>S&&i!=N)
        		speed--;
        }
        
        // 트랙 끝에서썰매의 속도 출력
        bw.write(speed+"");
        
        bw.close();
    } // end of main
} // end of Main class