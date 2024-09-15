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
        
        // 데이터의 수 K 입력
        int K = Integer.valueOf(br.readLine());
        
        for(int i=1;i<=K;i++) {
        	
        	// 예측 강우량과 실제 강우량 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int E = Integer.valueOf(st.nextToken());
        	int A = Integer.valueOf(st.nextToken());
        	
        	// 각 데이터의 가뭄 상태 출력
        	bw.write(String.format("Data Set %d:\n", i));
        	
        	// 예측 강우량이 실제 강우량 이하인 경우
        	if(E<=A)
        		bw.write("no drought\n\n");
        	
        	// 예측 강우량이 실제 강우량의 5배 이하인 경우
        	else if(E<=A*5)
        		bw.write("drought\n\n");
        	
        	// 예측 강우량이 실제 강우량의 5배를 초과하는 경우
        	else {
        		
        		// "엄청"이 붙는 횟수 계산
        		while(!(E<=A*5)) {
        			bw.write("mega ");
        			A*=5;
        		}
        		
        		bw.write("drought\n\n");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class