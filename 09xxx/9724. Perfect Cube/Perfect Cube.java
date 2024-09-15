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
        
        for(int i=1;i<=T;i++) {
        	
        	// A, B 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double A = Double.valueOf(st.nextToken());
        	double B = Double.valueOf(st.nextToken());
        	
        	// A~B 사이의 완전 세제곱수의 개수 계산
        	int perfectCubeNum = (int)(Math.ceil(Math.pow(B, 1/3.0))
                                       -Math.ceil(Math.pow(A, 1/3.0)));
        	
        	// A~B 사이의 완전 세제곱수의 개수 출력
        	bw.write(String.format("Case #%d: %d\n", i, perfectCubeNum));
        }
        
        bw.close();
    } // end of main
} // end of Main class