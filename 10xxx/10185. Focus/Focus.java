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
        
        // 데이터 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T-->0) {
        	
        	// 물체 거리 p와 이미지 거리 q 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double p = Double.valueOf(st.nextToken());
        	double q = Double.valueOf(st.nextToken());
        	
        	// 초점 거리 출력
        	bw.write(String.format("f = %.1f\n", p*q/(p+q)));
        }
        
        bw.close();
    } // end of main
} // end of Main class