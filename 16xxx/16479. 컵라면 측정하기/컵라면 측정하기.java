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
    	
    	// 왼쪽, 오른쪽 변의 길이 K, 윗변의 길이 D1, 밑변의 길이 D2 입력
    	double K = Double.valueOf(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	double D1 = Double.valueOf(st.nextToken());
    	double D2 = Double.valueOf(st.nextToken());
    	
    	// 길이가 h, (D1-D2)/2, K인 삼각형
    	
    	// h^2 계산
    	bw.write(K*K-(D1-D2)*(D1-D2)/4+"");
    	
    	bw.close();
    } // end of main
} // end of Main class