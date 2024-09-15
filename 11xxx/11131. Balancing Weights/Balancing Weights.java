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
        
        // 테스트 케이스의 수 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 물체의 개수 입력
        	int N = Integer.valueOf(br.readLine());
        	
        	// 물체의 위치 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int angle=0;
        	
        	for(int i=0;i<N;i++)
        		angle += Integer.valueOf(st.nextToken());
        	
        	// 막대가 어디로 기울어졌는지 출력
        	if(angle<0)
        		bw.write("Left\n");
        	else if(angle>0)
        		bw.write("Right\n");
        	else
        		bw.write("Equilibrium\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class