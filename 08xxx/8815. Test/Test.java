import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        /*
         * A B C
         * B C D
         * C D A
         * D A B
         * 반복
         */
        String answer = "ABCBCDCDADAB";
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 정수 N 입력
        	int N = Integer.valueOf(br.readLine());
        	
        	// N번째 문제에서 헥토르가 낸 답 출력
        	bw.write(answer.charAt((N-1)%12)+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class
