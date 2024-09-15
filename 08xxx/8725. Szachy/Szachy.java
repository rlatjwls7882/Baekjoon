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
        
        // 체스판의 크기 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 모든 행에서의 양수 중 최댓값의 합 계산
        int sum=0;
        
        while(N-->0) {
        	
        	// 한 행에서의 양수 중 최댓값 찾기
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int max=0;
        	
        	while(st.hasMoreTokens()) {
        		int tmp = Integer.valueOf(st.nextToken());
        		
        		if(max<tmp) max=tmp;
        	}
        	
        	sum += max;
        }
        
        // 파울렉이 얻을 수 있는 최댓값 출력
        bw.write(sum+"");
        bw.close();
    } // end of main
} // end of Main class