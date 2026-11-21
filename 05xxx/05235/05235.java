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
        	
        	// 원소의 개수 k 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int k = Integer.valueOf(st.nextToken());
        	
        	// 짝수의 합과 홀수의 합 계산
        	int evenSum=0, oddSum=0;
        	
        	for(int i=0;i<k;i++) {
        		int tmp = Integer.valueOf(st.nextToken());
        		
        		if(tmp%2==0) evenSum+=tmp;
        		else oddSum+=tmp;
        	}
        	
        	// 짝수의 합과 홀수의 합의 크기 비교
        	if(evenSum>oddSum) bw.write("EVEN\n");
        	else if(oddSum>evenSum) bw.write("ODD\n");
        	else bw.write("TIE\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class