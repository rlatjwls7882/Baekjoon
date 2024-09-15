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
        	
        	// A, B, C 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double A = Double.valueOf(st.nextToken());
        	double B = Double.valueOf(st.nextToken());
        	double C = Double.valueOf(st.nextToken());
        	
        	// A와 B로 C를 만들 수 있는지 확인
        	if(A+B==C||Math.abs(A-B)==C||A*B==C||A/B==C||B/A==C)
        		bw.write("Possible\n");
        	else
        		bw.write("Impossible\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class