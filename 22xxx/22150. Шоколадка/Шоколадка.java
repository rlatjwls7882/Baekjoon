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
        
        // 테스트 케이스의 수 t 입력
        int t = Integer.valueOf(br.readLine());
        
        while(t-->0) {
        	
        	// 초콜릿의 한 변의 길이 n 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.valueOf(st.nextToken());
        	
        	// 부서진 초콜릿의 크기 계산
        	int sum=0;
        	
        	for(int i=0;i<n*2;i++)
        		sum += Integer.valueOf(st.nextToken());
        	
        	// 누가 초콜릿을 먹었는지 확인
        	if(sum==n*n)
        		bw.write("no\n");
        	else
        		bw.write("yes\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class