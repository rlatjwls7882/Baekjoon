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
    	
    	// 테스트 케이스 개수 P
    	int P = Integer.valueOf(br.readLine());
    	
    	while(P--!=0) {
    		// 테스트 케이스 번호 N, 철로의 길이 D, 두 기차의 속도 A B, 파리의 속도 F
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int N = Integer.valueOf(st.nextToken());
    		double D = Double.valueOf(st.nextToken());
    		double A = Double.valueOf(st.nextToken());
    		double B = Double.valueOf(st.nextToken());
    		double F = Double.valueOf(st.nextToken());
    		
    		// 파리가 움직인 거리 출력
    		bw.write(N+" "+(D/(A+B)*F)+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class