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
        
        // 가변배열의 초기 크기, 저장하는 명령의 개수, 삭제하는 명령의 개수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.valueOf(st.nextToken());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        // 초기크기, 현재 사용하는 크기 생성
        int capacity=S, usage=0;
        
        // 명령 수행
        for(int i=0;i<N+M;i++) {
        	
        	// 원소 저장
        	if(br.readLine().equals("1")) {
        		usage++;
        		
        		// 저장공간이 꽉찬 경우 2배로 늘림
        		if(capacity<usage)
        			capacity*=2;
        	}
        	
        	// 원소 삭제
        	else
        		usage--;
        }
        
        // 모든 명령을 처리한 후 가변배열의 크기 출력
        bw.write(capacity+"");
        bw.close();
    } // end of main
} // end of Main class