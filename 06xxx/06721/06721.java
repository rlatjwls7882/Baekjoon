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
        	
        	// 두 정수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int A = Integer.valueOf(st.nextToken());
        	int B = Integer.valueOf(st.nextToken());
        	
        	// 뒤집힌 두 정수의 합을 뒤집어서 출력
        	int sum = reverse(A)+reverse(B);
        	bw.write(reverse(sum)+"\n");
        }
        
        bw.close();
    } // end of main
    
    // 뒤집힌 수 계산
    static int reverse(int N) {
    	
    	int Nlength = (int)Math.log10(N);
    	int reversedN=0;
    	
    	while(N!=0) {
    		reversedN += (N%10)*Math.pow(10, Nlength--);
    		N/=10;
    	}
    	
    	return reversedN;
    } // end of reverse
} // end of Main class